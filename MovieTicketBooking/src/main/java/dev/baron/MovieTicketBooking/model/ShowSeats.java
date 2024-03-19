package dev.baron.MovieTicketBooking.model;


import dev.baron.MovieTicketBooking.model.constant.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeats extends BaseModel{

    private int price;

    @ManyToOne
    private Shows show;

    @ManyToOne
    private Seats seat;

    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;

    public ShowSeats() {
    }

    public ShowSeats(int price, Shows show, Seats seat, ShowSeatStatus showSeatStatus) {
        this.price = price;
        this.show = show;
        this.seat = seat;
        this.showSeatStatus = showSeatStatus;
    }
}
