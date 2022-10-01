package com.example.autoheroback.secu;


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
public class Secu {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;
    public int idvoiture;

    public String secu1;
    public String secu2;
    public String secu3;
    public String secu4;
    public String secu5;

    public Secu(int idvoiture, String secu1, String secu2, String secu3, String secu4, String secu5) {
        this.idvoiture = idvoiture;
        this.secu1 = secu1;
        this.secu2 = secu2;
        this.secu3 = secu3;
        this.secu4 = secu4;
        this.secu5 = secu5;
    }
}
