package com.mycompany.futoverseny.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Eredmeny {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Futo futo;

    @ManyToOne
    private Verseny verseny;

    private int idoEredmeny; // idő percben

    // Getters és Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Futo getFuto() {
        return futo;
    }

    public void setFuto(Futo futo) {
        this.futo = futo;
    }

    public Verseny getVerseny() {
        return verseny;
    }

    public void setVerseny(Verseny verseny) {
        this.verseny = verseny;
    }

    public int getIdoEredmeny() {
        return idoEredmeny;
    }

    public void setIdoEredmeny(int idoEredmeny) {
        this.idoEredmeny = idoEredmeny;
    }
}
