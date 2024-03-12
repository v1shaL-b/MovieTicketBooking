package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ACTOR_INFO")
public class Actor extends BaseModel{

    private String name;

}
