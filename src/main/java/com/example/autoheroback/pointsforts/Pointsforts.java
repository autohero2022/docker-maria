package com.example.autoheroback.pointsforts;

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
public class Pointsforts {

    @Id
    @SequenceGenerator(
            name="pf",
            sequenceName="pf_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pf_sequence"
    )
    public int id;
    public int idvoiture;

    public String pf1;
    public String pf2;
    public String pf3;
    public String pf4;
    public String pf5;

    public Pointsforts(int idvoiture, String pf1, String pf2, String pf3, String pf4, String pf5) {
        this.idvoiture = idvoiture;
        this.pf1 = pf1;
        this.pf2 = pf2;
        this.pf3 = pf3;
        this.pf4 = pf4;
        this.pf5 = pf5;
    }
}
