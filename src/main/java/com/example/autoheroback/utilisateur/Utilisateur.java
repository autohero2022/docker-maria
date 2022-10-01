package com.example.autoheroback.utilisateur;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Utilisateur implements UserDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idutilisateur;
    private String email;
    private String password;
    private Boolean actif = false;

    private Boolean connected = false;

    public Utilisateur(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password ;
    }

    public Boolean getConnected() {
        return connected;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public Boolean getActif() {
        return actif;
    }

    public Long getIdutilisateur() {
        return idutilisateur;
    }

    public String getEmail() {
        return email;
    }



}
