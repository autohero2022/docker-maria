package com.example.autoheroback.pointsforts;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface pointsfortsRepository extends JpaRepository<Pointsforts, Integer> {
    Pointsforts findByIdvoiture(int id);
}
