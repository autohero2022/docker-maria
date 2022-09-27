package com.example.autoheroback.eclairage;

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
public class Eclairage {


    @Id
    @SequenceGenerator(
            name="eclairage",
            sequenceName="eclairage_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "eclairage_sequence"
    )
    public int id;
    public int idvoiture;

    public String eclairage1;
    public String eclairage2;
    public String eclairage3;
    public String eclairage4;
    public String eclairage5;

    public Eclairage(int idvoiture, String eclairage1, String eclairage2, String eclairage3, String eclairage4, String eclairage5) {
        this.idvoiture = idvoiture;
        this.eclairage1 = eclairage1;
        this.eclairage2 = eclairage2;
        this.eclairage3 = eclairage3;
        this.eclairage4 = eclairage4;
        this.eclairage5 = eclairage5;
    }
}
