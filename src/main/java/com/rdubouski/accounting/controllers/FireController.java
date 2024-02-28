package com.rdubouski.accounting.controllers;

import com.rdubouski.accounting.models.ListExtinguishers;
import com.rdubouski.accounting.repo.ListExtinguishersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FireController {

    @Autowired
    private ListExtinguishersRepository listExtinguishersRepository;

    @GetMapping("/fire")
    public String home(Model model) {
        Iterable<ListExtinguishers> listExtinguishers = listExtinguishersRepository.findAll();
        model.addAttribute("lists", listExtinguishers);
        return "fire";
    }

}