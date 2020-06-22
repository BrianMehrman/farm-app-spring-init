package mehrman.demo.farmappspringinit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class UserController {

    @Autowired
    private String webmaster;

    @GetMapping("/farm/users")
    public String listUses(Model model) {
        model.addAttribute("users", Arrays.asList("sjctrags", "root", "guest"));
        model.addAttribute("webmaster", webmaster);
        return "mst_user_list";
    }

    @GetMapping("/farm/guests")
    public String listGuests(Model model) {
        model.addAttribute("users", Arrays.asList("sjctrags", "root", "guest"));
        return "tpl_guest_list";
    }

    @GetMapping("/farm/providers")
    public String listProviders(Model model) {
        model.addAttribute("users", Arrays.asList("sjctrags", "root", "guest"));
        return "th_providers";
    }
}
