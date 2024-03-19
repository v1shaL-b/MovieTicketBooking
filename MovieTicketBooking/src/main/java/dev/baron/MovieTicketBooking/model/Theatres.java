package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatres extends BaseModel{

    private String theatresName;

    private String address;

    @OneToMany
    private List<Auditorium> auditoriums;

}
