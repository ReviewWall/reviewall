package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Kullanici;
import com.reviewall.reviewall.repository.KullaniciRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciServiceImp implements KullaniciService {
    private KullaniciRepository kullaniciRepository;

    public KullaniciServiceImp(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @Override
    public List<Kullanici> kullanicilariGetir() {
        return kullaniciRepository.findAll();
    }

    @Override
    public Kullanici kaydet(Kullanici kullanici) {
        return kullaniciRepository.save(kullanici);
    }

    @Override
    public Kullanici kullaniciGetirById(Long id) {
        Optional<Kullanici> result = kullaniciRepository.findById(id);
        return result.get();
    }

    @Override
    public void silKullaniciById(Long id) {
        kullaniciRepository.deleteById(id);
    }
}
