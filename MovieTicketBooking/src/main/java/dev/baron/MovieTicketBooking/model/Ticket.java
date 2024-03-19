package dev.baron.MovieTicketBooking.model;

import dev.baron.MovieTicketBooking.model.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{


    private LocalDateTime timeOfBooking;

    private double totalAmount;

    @OneToMany
    private List<ShowSeats> showSeats;

    @ManyToOne
    private Shows show;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
