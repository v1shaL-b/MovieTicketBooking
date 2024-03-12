package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "MOVIES_MASTER")
public class Movie extends BaseModel{

    private String name;
    private Actor actor;
}
