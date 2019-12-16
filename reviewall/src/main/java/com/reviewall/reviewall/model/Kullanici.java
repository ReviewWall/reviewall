package com.reviewall.reviewall.model;

import javax.persistence.*;

@Entity
@Table(name = "kullanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kullanici_id")
    private Long id;

    @Column(name = "isim")
    private String isim;

    @Column(name = "soyisim")
    private String soyisim;

    @Column(name = "kullanici_adi")
    private String kullaniciAdi;

    @Column(name = "parola")
    private String parola;

    @Column(name = "email")
    private String email;

    @Column(name = "telefon_numarasi")
    private String telefonNumarasi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public Boolean uygunMu() {
        if(this.kullaniciAdi == null) {
            return false;
        } else if(this.isim == null) {
            return false;
        } else if(this.soyisim == null) {
            return false;
        } else if(this.parola == null) {
            return false;
        }
        return true;
    }

}
