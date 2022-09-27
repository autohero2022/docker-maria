package com.example.autoheroback.multimedia;

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
public class Multimedia {

    @Id
    @SequenceGenerator(
            name="multimedia",
            sequenceName="multimedia_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "multimedia_sequence"
    )
    public int id;
    public int idvoiture;
    public String multimedia1;
    public String multimedia2;
    public String multimedia3;
    public String multimedia4;
    public String multimedia5;

    public Multimedia(int idvoiture, String multimedia1, String multimedia2, String multimedia3, String multimedia4, String multimedia5) {
        this.idvoiture = idvoiture;
        this.multimedia1 = multimedia1;
        this.multimedia2 = multimedia2;
        this.multimedia3 = multimedia3;
        this.multimedia4 = multimedia4;
        this.multimedia5 = multimedia5;
    }
}
