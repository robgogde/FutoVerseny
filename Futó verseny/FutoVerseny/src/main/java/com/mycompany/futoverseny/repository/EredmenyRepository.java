package com.mycompany.futoverseny.repository;

import com.mycompany.futoverseny.model.Eredmeny;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EredmenyRepository extends JpaRepository<Eredmeny, Long> {
    List<Eredmeny> findAllByVersenyIdOrderByIdoEredmenyAsc(Long versenyId);
    List<Eredmeny> findAllByVersenyId(Long versenyId);
}
