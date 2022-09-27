package com.example.autoheroback.multimedia;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {
    Multimedia findByIdvoiture(int id);
}
