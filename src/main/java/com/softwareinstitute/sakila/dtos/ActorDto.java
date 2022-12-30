package com.softwareinstitute.sakila.dtos;

import com.softwareinstitute.sakila.models.Actor;

public class ActorDto {
    private final Integer id;
    private final String firstName;
    private final String lastName;

    public ActorDto(Actor a) {
        this.id = a.getActorId();
        this.firstName = a.getFirstName();
        this.lastName = a.getLastName();
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
