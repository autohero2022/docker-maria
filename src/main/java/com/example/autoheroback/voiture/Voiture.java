package com.example.autoheroback.voiture;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Voiture {

    @Id
    @SequenceGenerator(
            name="car_sequence",
            sequenceName="car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )
    private Long voitureid;
    private String marque;
    private String motorisation;
    private String carburant;
    private String annee;
    private String kilometrage;
    private String prix;
    private String transmission;
    private String imgfrontale  ;

    public Voiture(String marque, String motorisation, String carburant,
                   String annee, String kilometrage, String prix, String transmission, String imgfrontale) {
        this.marque = marque;
        this.motorisation = motorisation;
        this.carburant = carburant;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.prix = prix;
        this.transmission = transmission;
        this.imgfrontale = imgfrontale;
    }

    public String getMarque() {
        return marque;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getAnnee() {
        return annee;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public String getPrix() {
        return prix;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getImgfrontale() {
        return imgfrontale;
    }
}
