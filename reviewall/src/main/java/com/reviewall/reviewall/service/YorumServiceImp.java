package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Kullanici;
import com.reviewall.reviewall.model.Yorum;
import com.reviewall.reviewall.repository.YorumRepository;
import org.springframework.stereotype.Service;
import com.reviewall.reviewall.model.Firma;

import java.util.List;
import java.util.Optional;

@Service
public class YorumServiceImp implements YorumService {

    private final YorumRepository yorumRepository;
    private final KullaniciService kullaniciService;
    private final FirmaService firmaService;

    public YorumServiceImp(YorumRepository yorumRepository, KullaniciService kullaniciService, FirmaService firmaService) {
        this.yorumRepository = yorumRepository;
        this.kullaniciService = kullaniciService;
        this.firmaService = firmaService;
    }

    @Override
    public List<Yorum> yorumlariGetir() {
        return yorumRepository.findAll();
    }

    @Override
    public Yorum kaydet(Long id,String firmaAdi, Yorum yorum) {
        Kullanici kullanici = kullaniciService.kullaniciGetirById(id);
        Firma firma = firmaService.getirFirmaByName(firmaAdi);
        yorum.setKullanici(kullanici);
        yorum.setFirma(firma);
        return yorumRepository.save(yorum);
    }

    @Override
    public void silYorumById(Long id) {
        yorumRepository.deleteById(id);
    }

    @Override
    public Yorum findYorumById(Long id) {
        Optional<Yorum> result = yorumRepository.findById(id);
        return result.get();
    }
}
