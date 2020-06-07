package mehrman.demo.farmappspringinit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchFromController {
    @Autowired
    private String projectName;

    @GetMapping("/farm/search")
    public String initForm(Model model) {
        model.addAttribute("projName", projectName);
        return "search_form";
    }

    @PostMapping("/farm/search")
    public String submitForm(Modle model, @RequestParam("keyword") String keyword) {
        model.addAttribute("projName", projectName);
        model.addAttribute("keyword", keyword);
        model.addAttribute("harvest", references());
        return "search_result";
    }

    public List<String> references() {
        return Array.asList("Apples", "Tomato", "Potato");
    }
}
