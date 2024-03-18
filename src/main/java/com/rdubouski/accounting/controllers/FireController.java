package com.rdubouski.accounting.controllers;

import com.rdubouski.accounting.models.ListExtinguishers;
import com.rdubouski.accounting.repo.ListExtinguishersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

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
    public String fireNewAdd(@RequestParam String department, @RequestParam String fio, @RequestParam String number,
                             @RequestParam String brand, @RequestParam String place,
                             @RequestParam java.sql.Date date_load, @RequestParam java.sql.Date date_reload, Model model) {
        ListExtinguishers lE = new ListExtinguishers(department, fio, number, brand, place, date_load, date_reload);
        listExtinguishersRepository.save(lE);
        return "redirect:/fire";
    }

    @GetMapping("/fire/{id}")
    public String fireDetails(@PathVariable(value = "id") long id, Model model) {
        if(!listExtinguishersRepository.existsById(id)) {
            return "redirect:/fire";
        }
        Optional<ListExtinguishers> listExtinguishers = listExtinguishersRepository.findById(id);
        ArrayList<ListExtinguishers> res = new ArrayList<>();
        listExtinguishers.ifPresent(res::add);
        model.addAttribute("le", res);
        return "fire-detail";
    }

    @GetMapping("/fire/{id}/edit")
    public String fireEdit(@PathVariable(value = "id") long id, Model model) {
        if(!listExtinguishersRepository.existsById(id)) {
            return "redirect:/fire";
        }
        Optional<ListExtinguishers> listExtinguishers = listExtinguishersRepository.findById(id);
        ArrayList<ListExtinguishers> res = new ArrayList<>();
        listExtinguishers.ifPresent(res::add);
        model.addAttribute("le", res);
        return "fire-edit";
    }

    @PostMapping("/fire/{id}/edit")
    public String fireUpdate(@PathVariable(value = "id") long id, @RequestParam String department, @RequestParam String fio,
                             @RequestParam String number, @RequestParam String brand, @RequestParam String place,
                             @RequestParam java.sql.Date date_load, @RequestParam java.sql.Date date_reload, Model model) {
        ListExtinguishers listExtinguishers = listExtinguishersRepository.findById(id).orElseThrow();
        listExtinguishers.setDepartment(department);
        listExtinguishers.setFio(fio);
        listExtinguishers.setNumber(number);
        listExtinguishers.setBrand(brand);
        listExtinguishers.setPlace(place);
        listExtinguishers.setDate_load(date_load);
        listExtinguishers.setDate_reload(date_reload);
        listExtinguishersRepository.save(listExtinguishers);

        return "redirect:/fire";
    }

    @PostMapping("/fire/{id}/remove")
    public String fireDelete(@PathVariable(value = "id") long id, Model model) {
        ListExtinguishers listExtinguishers = listExtinguishersRepository.findById(id).orElseThrow();
        listExtinguishersRepository.delete(listExtinguishers);

        return "redirect:/fire";
    }

}