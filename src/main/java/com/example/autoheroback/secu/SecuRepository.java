package com.example.autoheroback.secu;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecuRepository extends JpaRepository<Secu, Integer> {
    Secu findByIdvoiture(int id);
}
