package com.example.autoheroback.diaporama;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaporamaRepository extends JpaRepository<Diaporama, Integer> {
    Diaporama findByIdvoiture(int id);
}
