package com.example.autoheroback.voiture;


import com.example.autoheroback.autres.Autres;
import com.example.autoheroback.autres.AutresRepository;
import com.example.autoheroback.confort.Confort;
import com.example.autoheroback.confort.ConfortRepository;
import com.example.autoheroback.diaporama.Diaporama;
import com.example.autoheroback.diaporama.DiaporamaRepository;
import com.example.autoheroback.eclairage.Eclairage;
import com.example.autoheroback.eclairage.EclairageRepository;
import com.example.autoheroback.multimedia.Multimedia;
import com.example.autoheroback.multimedia.MultimediaRepository;
import com.example.autoheroback.pointsforts.Pointsforts;
import com.example.autoheroback.pointsforts.pointsfortsRepository;
import com.example.autoheroback.secu.Secu;
import com.example.autoheroback.secu.SecuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VoituredescriptionService {

    private final VoituredescriptionRepository voitureDescriptionRepository;
    public AutresRepository autresRepository;
    public ConfortRepository confortRepository;
    public DiaporamaRepository diaporamaRepository;
    public EclairageRepository eclairageRepository;
    public MultimediaRepository multimediaRepository;
    public pointsfortsRepository pfRepository;
    public SecuRepository secuRepository;

    public Voituredescription getVoitureDescriptionByIdVoiture(final int id) {
        return voitureDescriptionRepository.findByIdvoiturestrange(id);
    }

    public Voituredescription save(Voituredescription voituredesc) {
        return voitureDescriptionRepository.save(voituredesc) ;
    }

    public Autres saveAutre(Autres autre){
        return  autresRepository.save(autre);
    }

    public Confort saveConfort(Confort confort){
        return confortRepository.save(confort);
    }

    public Diaporama saveDiaporama(Diaporama diapo){
        return diaporamaRepository.save(diapo);
    }

    public Eclairage saveEclairage(Eclairage e){
        return eclairageRepository.save(e);
    }

    public Multimedia saveMultimedia(Multimedia m){
        return multimediaRepository.save(m);
    }

    public Pointsforts savePf(Pointsforts p){
        return pfRepository.save(p);
    }

    public Secu saveSecu(Secu s){
        return secuRepository.save(s);
    }

    public Autres getAutresbyidvoiture(final int id) {
        return autresRepository.findByIdvoiture(id);
    }

    public Confort getConfortbyidvoiture(final int id) {
        return confortRepository.findByIdvoiture(id);
    }

    public Diaporama getDiaporamabyidvoiture(final int id) {
        return diaporamaRepository.findByIdvoiture(id);
    }

    public Eclairage getEclairagebyidvoiture(final int id) {
        return eclairageRepository.findByIdvoiture(id);
    }

    public Multimedia getMultimediabyidvoiture(final int id) {
        return multimediaRepository.findByIdvoiture(id);
    }

    public Pointsforts getPointsfortsbyidvoiture(final int id) {
        return pfRepository.findByIdvoiture(id);
    }

    public Secu getSecubyidvoiture(final int id) {
        return secuRepository.findByIdvoiture(id);
    }





}
