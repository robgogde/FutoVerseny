package com.mycompany.futoverseny.repository;

import com.mycompany.futoverseny.model.Futo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FutoRepository extends JpaRepository<Futo, Long> {
}
