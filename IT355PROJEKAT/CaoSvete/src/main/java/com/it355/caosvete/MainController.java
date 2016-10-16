package com.it355.caosvete;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String printHello(ModelMap model) {
        model.addAttribute("poruka", "IT355-Prvi domaci zadatak");
        return "home";
    }
    
    
}
