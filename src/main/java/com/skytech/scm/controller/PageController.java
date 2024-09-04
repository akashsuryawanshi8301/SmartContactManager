package com.skytech.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("Name", "SkyTech Technology");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("Name", "SkyTech Technology");
        model.addAttribute("location", "Pune");
        model.addAttribute("Contact", "9172772723");
        return "about";
    }

    @GetMapping("/service")
    public String service(Model model){
        model.addAttribute("Name", "SkyTech Technology");
        model.addAttribute("location", "Pune");
        return "service";
    }


}
