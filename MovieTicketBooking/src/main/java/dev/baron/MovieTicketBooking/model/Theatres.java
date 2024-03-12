package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "THEATRES_MASTER")
public class Theatres extends BaseModel{

    private String theatresName;

    private String address;

    @OneToMany
    private List<Auditorium> auditoriums;

}
