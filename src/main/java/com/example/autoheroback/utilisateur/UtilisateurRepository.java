package com.example.autoheroback.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByEmail(String email);

    @Query("select count(p) = 1 from Utilisateur p where email = ?1 and actif = 1")
    public Optional<Utilisateur> findExistByEmailandActive(String name);

    @Transactional
    @Modifying
    @Query("UPDATE Utilisateur a " +
            "SET a.actif = TRUE WHERE a.email = ?1")
    int activeUtilisateur(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Utilisateur a " +
            "SET a.connected = 1 WHERE a.email = ?1")
    int connectUtilisateur(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Utilisateur a " +
            "SET a.connected = 0 WHERE a.email = ?1")
    int disconnectUtilisateur(String email);
}
