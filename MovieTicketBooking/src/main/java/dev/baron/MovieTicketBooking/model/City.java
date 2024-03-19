package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel{

    private String cityName;

    @OneToMany
    private List<Theatres> theatres;

}
