package com.softwareinstitute.sakila.controllers;

import com.softwareinstitute.sakila.dtos.ActorCreateDto;
import com.softwareinstitute.sakila.dtos.ActorDto;
import com.softwareinstitute.sakila.models.Actor;
import com.softwareinstitute.sakila.repositories.ActorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/actors")
public class ActorController {

    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping("")
    public List<ActorDto> getAll() {
        return actorRepository.findAll()
                .stream().map(ActorDto::new)
                .toList();
    }

    @PostMapping("")
    public ActorDto create(@RequestBody ActorCreateDto actorCreateDto) {
        Actor a = new Actor();
        a.setFirstName(actorCreateDto.getFirstName());
        a.setLastName(actorCreateDto.getLastName());
        return new ActorDto(actorRepository.save(a));
    }
}
