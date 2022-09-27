package com.example.autoheroback.confort;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfortRepository extends JpaRepository<Confort, Integer> {
    Confort findByIdvoiture(int id);
}
