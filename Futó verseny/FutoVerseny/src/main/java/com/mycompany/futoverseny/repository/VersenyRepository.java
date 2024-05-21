package com.mycompany.futoverseny.repository;

import com.mycompany.futoverseny.model.Verseny;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VersenyRepository extends JpaRepository<Verseny, Long> {
}
