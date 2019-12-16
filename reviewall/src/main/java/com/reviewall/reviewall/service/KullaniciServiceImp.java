package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Kullanici;
import com.reviewall.reviewall.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class KullaniciServiceImp implements KullaniciService {

    private final KullaniciRepository kullaniciRepository;

    public KullaniciServiceImp(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @Override
    public List<Kullanici> kullanicilariGetir() {
        return kullaniciRepository.findAll();
    }

    @Override
    public Kullanici kaydet(Kullanici kullanici) {
        Kullanici olanKullanici = kullaniciRepository.findByUsername(kullanici.getUsername());
        if(olanKullanici == null) {
            return kullaniciRepository.save(kullanici);
        } else {
            return null;
        }
    }

    @Override
    public Kullanici kullaniciGetirById(Long id) {
        Optional<Kullanici> result = kullaniciRepository.findById(id);
        return result.get();
    }

    @Override
    public Kullanici kullaniciGetirByUsername(String username) {
        return kullaniciRepository.findByUsername(username);
    }

    @Override
    public void silKullaniciById(Long id) {
        kullaniciRepository.deleteById(id);
    }
}
