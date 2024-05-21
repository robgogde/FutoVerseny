package com.mycompany.futoverseny.service;

import com.mycompany.futoverseny.model.Eredmeny;
import com.mycompany.futoverseny.repository.EredmenyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EredmenyService {

    @Autowired
    private EredmenyRepository eredmenyRepository;

    public List<Eredmeny> findAll() {
        return eredmenyRepository.findAll();
    }

    public Eredmeny save(Eredmeny eredmeny) {
        return eredmenyRepository.save(eredmeny);
    }

    public void deleteById(Long id) {
        eredmenyRepository.deleteById(id);
    }
}
