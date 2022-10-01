package com.example.autoheroback.voiture;


import com.example.autoheroback.autres.Autres;
import com.example.autoheroback.confort.Confort;
import com.example.autoheroback.diaporama.Diaporama;
import com.example.autoheroback.eclairage.Eclairage;
import com.example.autoheroback.multimedia.Multimedia;
import com.example.autoheroback.pointsforts.Pointsforts;
import com.example.autoheroback.secu.Secu;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@CrossOrigin(origins = "*")
@RequestMapping(path ="api/v1/voituredescription")
@AllArgsConstructor
public class VoituredescriptionController {

    @Autowired
    private VoituredescriptionService voituredescriptionService;

    @GetMapping
    public Voituredescription getVoituredescription(@RequestParam("idvoiturestrange") int idvoiturestrange) {
        return voituredescriptionService.getVoitureDescriptionByIdVoiture(idvoiturestrange);
    }

    @PostMapping
    public Voituredescription saveVoitureDescription(Voituredescription voituredesc){
        return voituredescriptionService.save(voituredesc);
    }

    @GetMapping(path = "/entire")
    public ResponseEntity<?> getEntireDetails(@RequestParam("id") int id){

        VoiturePayload voiturePayload = new VoiturePayload();

        if(id != 0){
            Autres autres = voituredescriptionService.getAutresbyidvoiture(id);
            Confort confort = voituredescriptionService.getConfortbyidvoiture(id);
            Diaporama diaporama = voituredescriptionService.getDiaporamabyidvoiture(id);
            Eclairage eclairage = voituredescriptionService.getEclairagebyidvoiture(id);
            Multimedia multimedia = voituredescriptionService.getMultimediabyidvoiture(id);
            Pointsforts pointsforts = voituredescriptionService.getPointsfortsbyidvoiture(id);
            Secu secu = voituredescriptionService.getSecubyidvoiture(id);
            Voituredescription voituredescription = voituredescriptionService.getVoitureDescriptionByIdVoiture(id);

            voiturePayload.setAutres(autres);
            voiturePayload.setConfort(confort);
            voiturePayload.setDiaporama(diaporama);
            voiturePayload.setEclairage(eclairage);
            voiturePayload.setMultimedia(multimedia);
            voiturePayload.setPointsforts(pointsforts);
            voiturePayload.setSecu(secu);
            voiturePayload.setVoituredescription(voituredescription);

            return ResponseEntity.ok().body(voiturePayload);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }



    }
}
