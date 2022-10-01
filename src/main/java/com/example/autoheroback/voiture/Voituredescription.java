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
public class Voituredescription {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idvoituredescription;
    private int idvoiturestrange;

    private String marque;
    private String motorisation;
    private String prix;

    private String kilometrage;
    private String carburant;
    private String transmission;

    private String premiereimmatriculation;
    private String puissance;
    private String nombreancienproprietaire;
    private String classeduvehicule;
    private String nombreportiere;
    private String nombreplace;
    private String couleur;
    private String sellerie;
    private String saisondespneus;
    private Boolean moteurdorigine;
    private String cylindree;
    private String classedemission;
    private String emmission;
    private String paysdorigine;
    private String nombredecle;
    private String voitureaccidentee;
    private String derniererevision;
    private String regimetva;
    private String ctvalidejusqua;
    private String numerodinventaire;


    public Voituredescription(int idvoiturestrange, String marque, String motorisation, String prix, String kilometrage, String carburant, String transmission, String premiereimmatriculation, String puissance, String nombreancienproprietaire, String classeduvehicule, String nombreportiere, String nombreplace, String couleur, String sellerie, String saisondespneus, Boolean moteurdorigine, String cylindree, String classedemission,
                              String emmission, String paysdorigine,
                              String nombredecle, String voitureaccidentee, String derniererevision,
                              String regimetva, String ctvalidejusqua, String numerodinventaire) {
        this.idvoiturestrange = idvoiturestrange;
        this.marque = marque;
        this.motorisation = motorisation;
        this.prix = prix;
        this.kilometrage = kilometrage;
        this.carburant = carburant;
        this.transmission = transmission;
        this.premiereimmatriculation = premiereimmatriculation;
        this.puissance = puissance;
        this.nombreancienproprietaire = nombreancienproprietaire;
        this.classeduvehicule = classeduvehicule;
        this.nombreportiere = nombreportiere;
        this.nombreplace = nombreplace;
        this.couleur = couleur;
        this.sellerie = sellerie;
        this.saisondespneus = saisondespneus;
        this.moteurdorigine = moteurdorigine;
        this.cylindree = cylindree;
        this.classedemission = classedemission;
        this.emmission = emmission;
        this.paysdorigine = paysdorigine;
        this.nombredecle = nombredecle;
        this.voitureaccidentee = voitureaccidentee;
        this.derniererevision = derniererevision;
        this.regimetva = regimetva;
        this.ctvalidejusqua = ctvalidejusqua;
        this.numerodinventaire = numerodinventaire;
    }

    public int getIdvoiturestrange() {
        return idvoiturestrange;
    }

    public String getPremiereimmatriculation() {
        return premiereimmatriculation;
    }

    public String getPuissance() {
        return puissance;
    }

    public String getNombreancienproprietaire() {
        return nombreancienproprietaire;
    }

    public String getClasseduvehicule() {
        return classeduvehicule;
    }

    public String getNombreportiere() {
        return nombreportiere;
    }

    public String getNombreplace() {
        return nombreplace;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getSellerie() {
        return sellerie;
    }

    public String getSaisondespneus() {
        return saisondespneus;
    }

    public Boolean getMoteurdorigine() {
        return moteurdorigine;
    }

    public String getCylindree() {
        return cylindree;
    }

    public String getClassedemission() {
        return classedemission;
    }

    public String getEmmission() {
        return emmission;
    }

    public String getPaysdorigine() {
        return paysdorigine;
    }

    public String getNombredecle() {
        return nombredecle;
    }

    public String getVoitureaccidentee() {
        return voitureaccidentee;
    }

    public String getDerniererevision() {
        return derniererevision;
    }

    public String getRegimetva() {
        return regimetva;
    }

    public String getCtvalidejusqua() {
        return ctvalidejusqua;
    }

    public String getNumerodinventaire() {
        return numerodinventaire;
    }

}
