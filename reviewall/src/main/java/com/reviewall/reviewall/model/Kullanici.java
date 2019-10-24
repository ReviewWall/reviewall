package com.reviewall.reviewall.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Objects;
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

    @Min(0)
    @Max(5)
    @Column(name = "oylama")
    private Integer oylama;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "KULLANICI_YORUM_FIRMA",
            joinColumns = @JoinColumn(name = "kullanici_id"),
            inverseJoinColumns = @JoinColumn(name = "firma_id")
    )
    private Set<Firma> firmaSet;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "KULLANICI_YORUM_FIRMA",
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

    public Integer getOylama() {
        return oylama;
    }

    public void setOylama(Integer oylama) {
        this.oylama = oylama;
    }

    public Set<Firma> getFirmaSet() {
        return firmaSet;
    }

    public void setFirmaSet(Set<Firma> firmaSet) {
        this.firmaSet = firmaSet;
    }

    public Set<Yorum> getYorumSet() {
        return yorumSet;
    }

    public void setYorumSet(Set<Yorum> yorumSet) {
        this.yorumSet = yorumSet;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Kullanici kullanici = (Kullanici) obj;
        return kullanici_id.equals(kullanici.kullanici_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kullanici_id);
    }

    @Override
    public String toString() {
        return "Kullanici"+
                "{" + "kullanici_id=" + kullanici_id +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", parola='" + parola + '\'' +
                ", email='" + email + '\'' +
                ", telefonNumarasi='" + telefonNumarasi + '\'' +
                ", oylama=" + oylama +
                ", firmaSet=" + firmaSet +
                ", yorumSet=" + yorumSet +
                '}';
    }
}
