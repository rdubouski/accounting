package com.rdubouski.accounting.controllers;

import com.rdubouski.accounting.models.ListExtinguishers;
import com.rdubouski.accounting.repo.ListExtinguishersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FireController {

    @Autowired
    private ListExtinguishersRepository listExtinguishersRepository;

    @GetMapping("/fire")
    public String fireMain(Model model) {
        Iterable<ListExtinguishers> listExtinguishers = listExtinguishersRepository.findAll();
        model.addAttribute("lists", listExtinguishers);
        return "fire-main";
    }

    @GetMapping("/fire/add")
    public String fireAdd(Model model) {
        return "fire-add";
    }

    @PostMapping("/fire/add")
    public String fireNewAdd(@RequestParam String department, @RequestParam String number,
                             @RequestParam String brand, @RequestParam String place,
                             @RequestParam java.sql.Date date_load, @RequestParam java.sql.Date date_reload, Model model) {
        ListExtinguishers lE = new ListExtinguishers(department, number, brand, place, date_load, date_reload);
        listExtinguishersRepository.save(lE);
        return "redirect:/fire";
    }

}