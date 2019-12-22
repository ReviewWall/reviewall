package com.reviewall.reviewall.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "yorum")
public class Yorum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "yorum_id")
    private Long yorum_id;

    @Column(name = "urun_etiketi")
    private String urun;

    @Column(name = "yorum")
    private String yorum;

    @Min(1)
    @Max(5)
    @Column(name = "yildiz_sayisi")
    private Integer yildizSayisi;

    @Column(name = "kategori")
    private String kategori;

    @ManyToOne
    private Kullanici kullanici;

    @ManyToOne
    private Firma firma;

    public Long getYorum_id() {
        return yorum_id;
    }

    public void setYorum_id(Long yorum_id) {
        this.yorum_id = yorum_id;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urunEtiketi) {
        this.urun = urunEtiketi;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Integer getYildizSayisi() {
        return yildizSayisi;
    }

    public void setYildizSayisi(Integer yildizSayisi) {
        this.yildizSayisi = yildizSayisi;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
