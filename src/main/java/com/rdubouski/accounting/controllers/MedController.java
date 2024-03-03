package com.rdubouski.accounting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedController {

    @GetMapping("/med")
    public String medMain(Model model) {
        return "med";
    }
}
