package com.mycompany.futoverseny.service;

import com.mycompany.futoverseny.model.Eredmeny;
import com.mycompany.futoverseny.model.Verseny;
import com.mycompany.futoverseny.repository.EredmenyRepository;
import com.mycompany.futoverseny.repository.VersenyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VersenyService {

    @Autowired
    private VersenyRepository versenyRepository;

    @Autowired
    private EredmenyRepository eredmenyRepository;

    public List<Verseny> findAll() {
        return versenyRepository.findAll();
    }

    public Verseny save(Verseny verseny) {
        return versenyRepository.save(verseny);
    }

    public void deleteById(Long id) {
        versenyRepository.deleteById(id);
    }

    public List<String> getRaceRunners(Long versenyId) {
        List<Eredmeny> eredmenyek = eredmenyRepository.findAllByVersenyIdOrderByIdoEredmenyAsc(versenyId);
        return eredmenyek.stream()
                .map(e -> e.getFuto().getNev() + " - " + e.getIdoEredmeny() + " perc")
                .collect(Collectors.toList());
    }

    public double getAverageTime(Long versenyId) {
        List<Eredmeny> eredmenyek = eredmenyRepository.findAllByVersenyId(versenyId);
        return eredmenyek.stream()
                .mapToInt(Eredmeny::getIdoEredmeny)
                .average()
                .orElse(0);
    }
}
