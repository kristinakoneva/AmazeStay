package mk.ukim.finki.amaze_stay.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("bodyContent", "login_page");
        return "master_template.html";
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("bodyContent", "register_page");
        return "master_template.html";
    }
}
