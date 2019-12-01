package com.reviewall.reviewall.model;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "FIRMA_YORUM",
            joinColumns = @JoinColumn(name = "firma_id"),
            inverseJoinColumns = @JoinColumn(name = "yorum_id")
    )
    private Set<Yorum> yorumSet;

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

    public Set<Yorum> getYorumSet() {
        return yorumSet;
    }

    public void setYorumSet(Set<Yorum> yorumSet) {
        this.yorumSet = yorumSet;
    }
}
