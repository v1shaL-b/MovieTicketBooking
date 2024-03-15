package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "TICKET_MASTER")
public class Tickets extends BaseModel{

    private LocalDateTime timeOfBooking;
    private double totalAmount;

    @OneToMany
    private List<ShowSeats> showSeats;

    @ManyToOne
    private Shows show;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
