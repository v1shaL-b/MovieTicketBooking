package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "USER_MASTER")
public class User extends BaseModel{

    private String name;
    private String email;
    private int mobileNo;
    private String status;
    private List<Tickets> tickets;
}
