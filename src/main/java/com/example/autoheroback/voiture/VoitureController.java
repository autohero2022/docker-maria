package com.example.autoheroback.voiture;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path ="api/v1/voitures")
@AllArgsConstructor
public class VoitureController {

    @Autowired
    private VoitureService voitureService;

    @GetMapping(path = "/all")
    public Iterable<Voiture> getVoitures() {
        return voitureService.getAllVoiture();
    }

    @PostMapping
    public Voiture saveVoiture(Voiture voiture){
        return voitureService.save(voiture);
    }
}
