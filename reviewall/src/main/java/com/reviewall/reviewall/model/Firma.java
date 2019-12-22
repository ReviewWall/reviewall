package com.reviewall.reviewall.model;

import javax.persistence.*;

@Entity
@Table(name = "firma")
public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "firma_id")
    private Long id;

    @Column(name = "firma_adi")
    private String firmaAdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }
}
