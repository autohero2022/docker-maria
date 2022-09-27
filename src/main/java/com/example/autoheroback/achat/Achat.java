package com.example.autoheroback.achat;

import com.example.autoheroback.voiture.Voiture;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Achat {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long idachat;

    private String civilite;
    private String nom;
    private String prenom;
    private String telephone;
    private String datenaissance;
    private String numerovoie;
    private String nomvoie;
    private String codepostale;
    private String ville;
    private String pays;
    private String marque;
    private String transmission;
    private String motorisation;
    private String kilometrage;
    private String prix;
    private String email1;
    private String email2;


    public String getCivilite() {
        return civilite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public String getNumerovoie() {
        return numerovoie;
    }

    public String getNomvoie() {
        return nomvoie;
    }

    public String getCodepostale() {
        return codepostale;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getMarque() {
        return marque;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public String getPrix() {
        return prix;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }
}
