package com.example.autoheroback.achat;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class AchatRequest {
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
}
