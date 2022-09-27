package com.example.autoheroback.confort;

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
public class Confort {

    @Id
    @SequenceGenerator(
            name="confort_sequence",
            sequenceName="confort_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "confort_sequence"
    )
    public int id;

    public int idvoiture;
    public String confort1;
    public String confort2;
    public String confort3;
    public String confort4;
    public String confort5;

    public Confort(int idvoiture, String confort1, String confort2, String confort3, String confort4, String confort5) {
        this.idvoiture = idvoiture;
        this.confort1 = confort1;
        this.confort2 = confort2;
        this.confort3 = confort3;
        this.confort4 = confort4;
        this.confort5 = confort5;
    }


}
