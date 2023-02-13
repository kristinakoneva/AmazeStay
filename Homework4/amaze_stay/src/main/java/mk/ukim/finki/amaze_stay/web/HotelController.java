package mk.ukim.finki.amaze_stay.web;

import mk.ukim.finki.amaze_stay.model.*;
import mk.ukim.finki.amaze_stay.service.CommentService;
import mk.ukim.finki.amaze_stay.service.HotelService;
import mk.ukim.finki.amaze_stay.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/hotels")
public class HotelController {
    private final HotelService hotelService;
    private final CommentService commentService;
    private final UserService userService;

    public HotelController(HotelService hotelService, CommentService commentService, UserService userService) {
        this.hotelService = hotelService;
        this.commentService = commentService;
        this.userService = userService;
    }

    //1. get all hotels  XXX
    //2. get each hotel  XXX
    //3. add new hotel   X
    //4. edit hotel     X
    //5. delete hotel
    //6. save hotel   X
    //7. search
    //8. sort

    //1.
    @GetMapping
    public String getHotelsPage(Model model) {
        List<Hotel> hotels = this.hotelService.listAll();
        model.addAttribute("hotels", hotels);
        model.addAttribute("bodyContent", "hotels_page");
        return "master_template";
    }

    //2.
    @GetMapping("/{hotelId}")
    public String getHotelDetailsPage(@PathVariable ObjectId hotelId, Model model) {
        List<Comment> comments = this.commentService.findCommentsByHotel(hotelService.findHotelById(hotelId));
        model.addAttribute("hotel", hotelService.findHotelById(hotelId));
        model.addAttribute("comments", comments);
        model.addAttribute("bodyContent", "hotel_details_page");
        return "master_template.html";
    }

    //6.
    @PostMapping("/add")
    public String addHotel(@RequestParam(required = false) ObjectId id,
                           @RequestParam float latitude,
                           @RequestParam float longitude,
                           @RequestParam String name,
                           @RequestParam String website,
                           @RequestParam String address,
                           @RequestParam String phoneNumber,
                           @RequestParam String email,
                           @RequestParam String description,
                           @RequestParam String imagePath,
                           @RequestParam String bookingLink) {
        if (id != null) {
            this.hotelService.edit(id, latitude, longitude, name, website, address, phoneNumber, email, description, imagePath, bookingLink);
        } else {
            this.hotelService.saveHotel(new Hotel(latitude, longitude, name, website, address, phoneNumber, email, description, imagePath, bookingLink));
        }
        return "redirect:/hotels";
    }


    //3.
    @GetMapping("/add-form")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String addHotelPage(Model model) {
        model.addAttribute("bodyContent", "add-hotel");
        return "master_template";
    }

    //4.
    @GetMapping("/edit-form/{hotelId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String editHotelPage(@PathVariable ObjectId hotelId,
                                Model model) {
        Hotel hotel = this.hotelService.findHotelById(hotelId);
        model.addAttribute("hotel", hotel);
        model.addAttribute("bodyContent", "edit-hotel");
        return "master_template";
    }

    //5.
    @GetMapping("/delete/{hotelId}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteHotel(@PathVariable ObjectId hotelId) {
        this.hotelService.deleteHotelById(hotelId);
        return "redirect:/hotels";
    }

    //7.
    @PostMapping("/search")
    public String getHotelsBySearching(String keyword, Model model) {
        List<Hotel> hotels = hotelService.findHotelsByName(keyword);
        if (hotels.size() == 0) {
            hotels = hotelService.listAll();//exception
        }
        model.addAttribute("hotels", hotels);
        model.addAttribute("bodyContent", "hotels_page");
        return "master_template";
    }

    //8.
    @GetMapping("/sort")
    public String getHotelsSorted(Model model) {
        model.addAttribute("hotels", hotelService.sortAscendingAlphabetic());
        model.addAttribute("bodyContent", "hotels_page");
        return "master_template";
    }


    //Comments
    @PostMapping("/add-comment")
    public String addComment(
            @RequestParam String comment,
            @RequestParam(required = false) ObjectId userId,
            @RequestParam(required = false) ObjectId hotelId,
            @RequestParam float rating) {
        if (userId != null && hotelId != null)
            this.commentService.addNewComment(comment, userService.findUserById(userId), hotelService.findHotelById(hotelId), rating);

        return "redirect:/hotels/" + hotelId;
    }

    @GetMapping("/add-comment-form/{hotelId}")
    public String addCommentPage(@PathVariable ObjectId hotelId, Model model, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        model.addAttribute("userId", user.getId());
        model.addAttribute("hotelId", hotelId);
        model.addAttribute("bodyContent", "add-comment");
        return "master_template";
    }


}