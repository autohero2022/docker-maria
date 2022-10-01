package com.example.autoheroback.diaporama;

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
public class Diaporama {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    public int idvoiture;

    public String diaporama1;
    public String diaporama2;
    public String diaporama3;
    public String diaporama4;
    public String diaporama5;
    public String diaporama6;
    public String diaporama7;
    public String diaporama8;
    public String diaporama9;
    public String diaporama10;
    public String diaporama11;
    public String diaporama12;
    public String diaporama13;
    public String diaporama14;



    public Diaporama(int idvoiture, String diaporama1, String diaporama2,
                     String diaporama3, String diaporama4, String diaporama5,
                     String diaporama6, String diaporama7, String diaporama8,
                     String diaporama9, String diaporama10, String diaporama11,
                     String diaporama12, String diaporama13,
                     String diaporama14) {
        this.idvoiture = idvoiture;
        this.diaporama1 = diaporama1;
        this.diaporama2 = diaporama2;
        this.diaporama3 = diaporama3;
        this.diaporama4 = diaporama4;
        this.diaporama5 = diaporama5;
        this.diaporama6 = diaporama6;
        this.diaporama7 = diaporama7;
        this.diaporama8 = diaporama8;
        this.diaporama9 = diaporama9;
        this.diaporama10 = diaporama10;
        this.diaporama11 = diaporama11;
        this.diaporama12 = diaporama12;
        this.diaporama13 = diaporama13;
        this.diaporama14 = diaporama14;
    }
}
