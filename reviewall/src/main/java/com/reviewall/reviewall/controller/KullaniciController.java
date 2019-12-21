package com.reviewall.reviewall.controller;

import com.reviewall.reviewall.model.Kullanici;
import com.reviewall.reviewall.service.KullaniciService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Kullanici> kullaniciKaydet(@Valid @RequestBody Kullanici kullanici){

        if(!kullanici.uygunMu()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }

        Kullanici kaydedilenKullanici = kullaniciService.kaydet(kullanici);
        if(kaydedilenKullanici == null) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
        } else  {
            return ResponseEntity.ok(kaydedilenKullanici);
        }
    }

    @GetMapping("/{id}")
    public Kullanici kullaniciGetirById(@PathVariable Long id){
        return kullaniciService.kullaniciGetirById(id);
    }

    @DeleteMapping("/{id}")
    public void silKullaniciById(@PathVariable Long id){
        kullaniciService.silKullaniciById(id);
    }

    @PostMapping("/{kullaniciAdi}/changeProfile")
    public void kullaniciBilgileriDegistir(@PathVariable String kullaniciAdi, @RequestBody Kullanici kullanici) {
        Kullanici eskiKullanici = kullaniciService.kullaniciGetirByUsername(kullaniciAdi);
        kullanici.setId(eskiKullanici.getId());
        kullaniciService.kaydet(kullanici);
    }

}
