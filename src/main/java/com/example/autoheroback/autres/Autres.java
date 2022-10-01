package com.example.autoheroback.autres;


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
public class Autres {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;
    public int idvoiture;
    public String autres1;
    public String autres2;
    public String autres3;
    public String autres4;
    public String autres5;

    public Autres(int idvoiture, String autres1, String autres2, String autres3, String autres4, String autres5) {
        this.idvoiture = idvoiture;
        this.autres1 = autres1;
        this.autres2 = autres2;
        this.autres3 = autres3;
        this.autres4 = autres4;
        this.autres5 = autres5;
    }
}
