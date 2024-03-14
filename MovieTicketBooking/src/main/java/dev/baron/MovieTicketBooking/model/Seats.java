package dev.baron.MovieTicketBooking.model;

import dev.baron.MovieTicketBooking.model.constant.SeatStatus;
import dev.baron.MovieTicketBooking.model.constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "SEATS_MASTER")
public class Seats extends BaseModel{

    private int col;
    private int row;
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
