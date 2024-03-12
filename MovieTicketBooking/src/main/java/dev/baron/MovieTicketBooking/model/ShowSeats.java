package dev.baron.MovieTicketBooking.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "SHOW_SEATS_MASTER")
public class ShowSeats extends BaseModel{
}
