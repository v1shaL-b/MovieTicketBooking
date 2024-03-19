package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel{

    private String name;

    @ManyToMany
    private List<Movie> movies;
}
