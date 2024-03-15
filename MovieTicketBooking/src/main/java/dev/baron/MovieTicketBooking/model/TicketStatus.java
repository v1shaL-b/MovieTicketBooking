package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

public enum TicketStatus{
    BOOKED, INPROGRESS,CANCELLED;

}
