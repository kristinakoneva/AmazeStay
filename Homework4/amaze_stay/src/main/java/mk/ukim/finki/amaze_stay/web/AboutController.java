package mk.ukim.finki.amaze_stay.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aboutus")
public class AboutController {

    @GetMapping
    public String getAboutUsPage(Model model) {
        model.addAttribute("bodyContent", "aboutus_page");
        return "master_template.html";
    }
}
