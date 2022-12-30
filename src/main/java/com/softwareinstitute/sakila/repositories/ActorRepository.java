package com.softwareinstitute.sakila.repositories;

import com.softwareinstitute.sakila.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
