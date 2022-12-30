package com.softwareinstitute.sakila.dtos;

import com.softwareinstitute.sakila.models.Film;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilmDto {
    private final Integer id;
    private final String title;
    private final String description;
    private final Integer releaseYear;
    private final Integer rentalDuration;
    private final BigDecimal rentalRate;
    private final Integer length;
    private final BigDecimal replacementCost;
    private final String rating;
    private final String specialFeatures;

    public FilmDto(Film f) {
        this.id = f.getFilmId();
        this.title = f.getTitle();
        this.description = f.getDescription();
        this.releaseYear = f.getReleaseYear();
        this.rentalDuration = f.getRentalDuration();
        this.rentalRate = f.getRentalRate();
        this.length = f.getLength();
        this.replacementCost = f.getReplacementCost();
        this.rating = f.getRating();
        this.specialFeatures = f.getSpecialFeatures();
    }
}
