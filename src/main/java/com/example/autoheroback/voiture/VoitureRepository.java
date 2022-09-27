package com.example.autoheroback.voiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    Voiture findByVoitureid(Long id);


}
