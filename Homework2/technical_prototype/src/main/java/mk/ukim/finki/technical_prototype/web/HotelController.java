package mk.ukim.finki.technical_prototype.web;

import mk.ukim.finki.technical_prototype.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hotels")
public class HotelController {
    private final HotelService hotelService;


    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public String getHotelsPage(Model model){
        model.addAttribute("hotels",hotelService.listAllHotels());
        return "hotels_page.html";
    }

    @GetMapping("/hotels/{hotelId}")
    public String getHotelDetailsPage(@PathVariable Long hotelId, Model model){
        model.addAttribute("hotel",hotelService.findHotelById(hotelId));
        return "hotel_details_page.html";
    }
}
