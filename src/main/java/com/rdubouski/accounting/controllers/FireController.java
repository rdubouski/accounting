package com.rdubouski.accounting.controllers;

import com.rdubouski.accounting.models.Post;
import com.rdubouski.accounting.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FireController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/fire")
    public String home(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "fire";
    }

}
