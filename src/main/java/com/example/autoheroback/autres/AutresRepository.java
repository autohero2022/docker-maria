package com.example.autoheroback.autres;

import com.example.autoheroback.voiture.Voituredescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutresRepository extends JpaRepository<Autres, Integer> {

    Autres findByIdvoiture(int id);
}
