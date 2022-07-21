package com.eduardosemkiwxavier.github_actions_springboot.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String teste(){
        return "Testando github actions!";
    }

}
