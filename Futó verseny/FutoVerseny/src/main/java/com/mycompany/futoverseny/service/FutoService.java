package com.mycompany.futoverseny.service;

import com.mycompany.futoverseny.model.Futo;
import com.mycompany.futoverseny.repository.FutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutoService {

    @Autowired
    private FutoRepository futoRepository;

    public List<Futo> findAll() {
        return futoRepository.findAll();
    }

    public Futo save(Futo futo) {
        return futoRepository.save(futo);
    }

    public void deleteById(Long id) {
        futoRepository.deleteById(id);
    }
}
