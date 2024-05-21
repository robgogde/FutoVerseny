package com.mycompany.futoverseny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home/futok")
    public String futok() {
        return "futok";
    }

    @GetMapping("/home/versenyek")
    public String versenyek() {
        return "versenyek";
    }
}
