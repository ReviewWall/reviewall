package com.reviewall.reviewall.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "firma")
public class Firma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "firma_id")
    private Long firma_id;

    @Column(name = "firma_adi")
    private String firmaAdi;

    @Column(name = "urun")
    private String urun;

    public Long getFirma_id() {
        return firma_id;
    }

    public void setFirma_id(Long firma_id) {
        this.firma_id = firma_id;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Firma firma = (Firma) obj;
        return firma_id.equals(firma.firma_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firma_id);
    }

    @Override
    public String toString() {
        return "Firma"+
                "{" + "firma_id=" + firma_id +
                ", firmaAdi='" + firmaAdi + '\'' +
                ", urun='" + urun + '\'' +
                '}';
    }
}
