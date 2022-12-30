package com.softwareinstitute.sakila.repositories;

import com.softwareinstitute.sakila.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
