package com.example.autoheroback.voiture;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoituredescriptionRepository extends JpaRepository<Voituredescription, Long> {

    Voituredescription findByIdvoiturestrange(int id);
}
