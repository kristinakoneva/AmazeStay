package mk.ukim.finki.amaze_stay.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/"})
public class HomeController {

    @GetMapping
    public String getHomePage(Model model) {
        model.addAttribute("bodyContent", "home_page");
        return "master_template.html";
    }

    @GetMapping("/access_denied")
    public String getAccessDeniedPage(Model model) {
        model.addAttribute("bodyContent","access_denied");
        return "master_template";
    }
}
