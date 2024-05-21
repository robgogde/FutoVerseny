package com.mycompany.futoverseny.controller;

import com.mycompany.futoverseny.model.Verseny;
import com.mycompany.futoverseny.service.VersenyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/versenyek")
public class VersenyController {

    @Autowired
    private VersenyService versenyService;

    @GetMapping
    public String findAll(Model model) {
        List<Verseny> versenyek = versenyService.findAll();
        model.addAttribute("versenyek", versenyek);
        return "versenyek";
    }

    @PostMapping
    @ResponseBody
    public Verseny save(@RequestBody Verseny verseny) {
        return versenyService.save(verseny);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteById(@PathVariable Long id) {
        versenyService.deleteById(id);
    }
}
