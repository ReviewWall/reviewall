package com.reviewall.reviewall.controller;

import com.reviewall.reviewall.model.Kullanici;
import com.reviewall.reviewall.service.KullaniciService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/kullanicilar")
public class KullaniciController {

    private final KullaniciService kullaniciService;

    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @GetMapping
    public List<Kullanici> tumKullanicilariGetir() {
        return kullaniciService.kullanicilariGetir();
    }

    @PostMapping
    public Kullanici kullaniciKaydet(@Valid @RequestBody Kullanici kullanici){
        kullaniciService.kaydet(kullanici);
        return kullanici;
    }

    @GetMapping("/{id}")
    public Kullanici kullaniciGetirById(@PathVariable Long id){
        return kullaniciService.kullaniciGetirById(id);
    }

    @DeleteMapping("/{id}")
    public void silKullaniciById(@PathVariable Long id){
        kullaniciService.silKullaniciById(id);
    }



}
