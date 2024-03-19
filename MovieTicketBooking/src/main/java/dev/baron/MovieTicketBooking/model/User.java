package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "USER_MASTER")
public class User extends BaseModel{

    private String name;

    @Column(unique = true)
    private String email;

    private int mobileNo;

    private String status;

    @OneToMany
    private List<Ticket> tickets;
}
