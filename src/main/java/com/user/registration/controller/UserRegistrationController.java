package com.user.registration.controller;

import com.user.registration.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegistrationController {


    @GetMapping ("/register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user){
        return "register_success";
    }
}
