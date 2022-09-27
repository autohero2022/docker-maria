package com.example.autoheroback.eclairage;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EclairageRepository extends JpaRepository<Eclairage, Integer> {
    Eclairage findByIdvoiture(int id);
}
