package com.mycompany.futoverseny.controller;

import com.mycompany.futoverseny.model.Futo;
import com.mycompany.futoverseny.service.FutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/futok")
public class FutoController {

    @Autowired
    private FutoService futoService;

    @GetMapping
    public String findAll(Model model) {
        List<Futo> futok = futoService.findAll();
        model.addAttribute("futok", futok);
        return "futok";
    }

    @PostMapping
    @ResponseBody
    public Futo save(@RequestBody Futo futo) {
        return futoService.save(futo);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteById(@PathVariable Long id) {
        futoService.deleteById(id);
    }
}
