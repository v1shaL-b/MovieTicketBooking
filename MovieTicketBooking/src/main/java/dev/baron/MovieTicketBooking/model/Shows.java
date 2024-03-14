package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "SHOWS_MASTER")
public class Shows extends BaseModel{

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    private List<ShowSeats> showSeats;
}
