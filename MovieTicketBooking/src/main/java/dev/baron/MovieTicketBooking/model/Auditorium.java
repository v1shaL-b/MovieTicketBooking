package dev.baron.MovieTicketBooking.model;

import dev.baron.MovieTicketBooking.model.constant.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{

    private String name;

    private int capacity;

    @OneToMany
    private List<Shows> shows;

    @OneToMany
    private List<Seats> seats;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeatures> auditoriumFeatures;
}
