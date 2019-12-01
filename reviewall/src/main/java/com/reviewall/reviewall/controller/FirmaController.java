package com.reviewall.reviewall.controller;

import com.reviewall.reviewall.model.Firma;
import com.reviewall.reviewall.service.FirmaService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/firmalar")
public class FirmaController {

    private FirmaService firmaService;

    public FirmaController(FirmaService firmaService) {
        this.firmaService = firmaService;
    }

    @GetMapping
    public List<Firma> tumFirmalariGetir(){
        return firmaService.firmalariGetir();
    }

    @PostMapping
    public Firma firmaKaydet(@Valid @RequestBody Firma firma){
        firmaService.kaydet(firma);
        return firma;
    }

    @GetMapping("/{id}")
    public void silFirmaById(@PathVariable Long id){
        firmaService.silFirmaById(id);
    }

}
