package com.reviewall.reviewall.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kullanici")
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kullanici_id")
    private Long kullanici_id;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "KULLANICI_YORUM",
            joinColumns = @JoinColumn(name = "kullanici_id"),
            inverseJoinColumns = @JoinColumn(name = "yorum_id")
    )
    private Set<Yorum> yorumSet;

    public Long getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(Long kullanici_id) {
        this.kullanici_id = kullanici_id;
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

    public Set<Yorum> getYorumSet() {
        return yorumSet;
    }

    public void setYorumSet(Set<Yorum> yorumSet) {
        this.yorumSet = yorumSet;
    }

}
