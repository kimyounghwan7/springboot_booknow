package com.booknow.travelapp.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping(value="/home")
    public String home2(Model model) {
        model.addAttribute("constroller", "view");
        return "home";
    }
    
}// BoardController end
