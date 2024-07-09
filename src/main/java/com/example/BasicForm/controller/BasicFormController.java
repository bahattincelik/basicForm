package com.example.BasicForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicFormController {


    @GetMapping("/")
    public String showForm(Model model) {
        return "index";
    }

    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("username") String username, Model model) {
        model.addAttribute("name", username);
        return "index";
    }


}
