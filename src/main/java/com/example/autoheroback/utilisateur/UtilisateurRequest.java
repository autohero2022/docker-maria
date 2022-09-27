package com.example.autoheroback.utilisateur;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode

public class UtilisateurRequest {
    private  String email;
    private  String password;

    public UtilisateurRequest() {
    }
}
