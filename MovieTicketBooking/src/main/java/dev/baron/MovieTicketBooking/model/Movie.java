package dev.baron.MovieTicketBooking.model;

import dev.baron.MovieTicketBooking.model.constant.MovieFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "MOVIES_MASTER")
public class Movie extends BaseModel{

    private String name;
    private String description;

    @ManyToMany
    private List<Actor> actor;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures> movieFeatures;
}
