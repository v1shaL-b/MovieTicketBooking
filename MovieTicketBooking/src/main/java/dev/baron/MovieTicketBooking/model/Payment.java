package dev.baron.MovieTicketBooking.model;


import dev.baron.MovieTicketBooking.model.constant.PaymentMode;
import dev.baron.MovieTicketBooking.model.constant.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "PAYMENT_MASTER")
public class Payment extends BaseModel{

    private Date paymentType;

    private double amount;
    private String referenceId;

    @ManyToOne
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

}
