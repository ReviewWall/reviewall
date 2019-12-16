package com.reviewall.reviewall.repository;

import com.reviewall.reviewall.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Kullanici , Long> {

    Kullanici findByKullaniciAdi(String username);

}
