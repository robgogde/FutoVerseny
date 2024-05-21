package com.mycompany.futoverseny.controller;

import com.mycompany.futoverseny.model.Eredmeny;
import com.mycompany.futoverseny.service.EredmenyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eredmenyek")
public class EredmenyController {

    @Autowired
    private EredmenyService eredmenyService;

    @GetMapping
    public List<Eredmeny> findAll() {
        return eredmenyService.findAll();
    }

    @PostMapping
    public Eredmeny save(@RequestBody Eredmeny eredmeny) {
        return eredmenyService.save(eredmeny);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        eredmenyService.deleteById(id);
    }
}
