package com.example.autoheroback.voiture;

import com.example.autoheroback.autres.Autres;
import com.example.autoheroback.confort.Confort;
import com.example.autoheroback.diaporama.Diaporama;
import com.example.autoheroback.eclairage.Eclairage;
import com.example.autoheroback.multimedia.Multimedia;
import com.example.autoheroback.pointsforts.Pointsforts;
import com.example.autoheroback.secu.Secu;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VoiturePayload {

    public Autres autres ;
    public Confort confort ;
    public Diaporama diaporama ;
    public Eclairage eclairage ;
    public Multimedia multimedia ;
    public Pointsforts pointsforts ;
    public Secu secu ;

    public Voituredescription voituredescription;

    public void setVoituredescription(Voituredescription voituredescription) {
        this.voituredescription = voituredescription;
    }

    public void setAutres(Autres autres) {
        this.autres = autres;
    }

    public void setConfort(Confort confort) {
        this.confort = confort;
    }

    public void setDiaporama(Diaporama diaporama) {
        this.diaporama = diaporama;
    }

    public void setEclairage(Eclairage eclairage) {
        this.eclairage = eclairage;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public void setPointsforts(Pointsforts pointsforts) {
        this.pointsforts = pointsforts;
    }

    public void setSecu(Secu secu) {
        this.secu = secu;
    }
}
