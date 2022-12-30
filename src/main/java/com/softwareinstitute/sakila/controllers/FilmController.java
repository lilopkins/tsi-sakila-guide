package com.softwareinstitute.sakila.controllers;

import com.softwareinstitute.sakila.dtos.FilmCreateDto;
import com.softwareinstitute.sakila.dtos.FilmDto;
import com.softwareinstitute.sakila.models.Film;
import com.softwareinstitute.sakila.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmController {

    private final FilmRepository filmRepository;

    @GetMapping("")
    public List<FilmDto> getAll() {
        return filmRepository.findAll()
                .stream().map(FilmDto::new)
                .toList();
    }

    @PostMapping("")
    public FilmDto create(@RequestBody FilmCreateDto filmCreateDto) {
        Film a = new Film();
        return new FilmDto(filmRepository.save(a));
    }

    @GetMapping("/{id}")
    public FilmDto getOne(@PathVariable("id") Integer id) {
        Optional<FilmDto> filmDto = filmRepository.findById(id)
                .map(FilmDto::new);
        if (filmDto.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return filmDto.get();
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable("id") Integer id) {
        filmRepository.deleteById(id);
    }
}
