package com.reviewall.reviewall.controller;

import com.reviewall.reviewall.model.Yorum;
import com.reviewall.reviewall.service.YorumService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/yorum")
public class YorumController {

    private YorumService yorumService;

    public YorumController(YorumService yorumService) {
        this.yorumService = yorumService;
    }

    @GetMapping("/tumYorumlar")
    public List<Yorum> tumYorumlarıGetir(){
        return yorumService.yorumlariGetir();
    }

    @PostMapping("/kaydet")
    public Yorum yorumKaydet(@Valid @RequestBody Yorum yorum){
        yorumService.kaydet(yorum);
        return yorum;
    }

    @GetMapping("/{id}")
    public void silYorumById(@PathVariable Long id){
        yorumService.silYorumById(id);
    }
}
