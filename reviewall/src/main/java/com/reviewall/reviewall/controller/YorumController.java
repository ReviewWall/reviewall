package com.reviewall.reviewall.controller;

import com.reviewall.reviewall.model.Yorum;
import com.reviewall.reviewall.service.YorumService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/yorumlar")
public class YorumController {

    private YorumService yorumService;

    public YorumController(YorumService yorumService) {
        this.yorumService = yorumService;
    }

    @GetMapping
    public List<Yorum> tumYorumlariGetir(){
        return yorumService.yorumlariGetir();
    }

    @PostMapping("/{id}/{firmaAdi}")
    public Yorum yorumKaydet(@PathVariable Long id,@PathVariable String firmaAdi,@Valid @RequestBody Yorum yorum){
        yorumService.kaydet(id,firmaAdi,yorum);
        return yorum;
    }

    @DeleteMapping("/{id}")
    public void silYorumById(@PathVariable Long id){
        yorumService.silYorumById(id);
    }

}
