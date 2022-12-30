package com.softwareinstitute.sakila.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilmCreateDto {
    private String title;
    private String description;
    private Integer releaseYear;
    private Integer rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
}
