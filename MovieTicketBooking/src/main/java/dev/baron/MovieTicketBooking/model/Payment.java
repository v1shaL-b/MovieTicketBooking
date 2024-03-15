package dev.baron.MovieTicketBooking.model;


import dev.baron.MovieTicketBooking.model.constant.PaymentMode;
import dev.baron.MovieTicketBooking.model.constant.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "PAYMENT_MASTER")
public class Payment extends BaseModel{

    private LocalDateTime paymentType;
    private double amount;
    private String referenceId;

    @ManyToOne
    private Tickets ticket;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

}
