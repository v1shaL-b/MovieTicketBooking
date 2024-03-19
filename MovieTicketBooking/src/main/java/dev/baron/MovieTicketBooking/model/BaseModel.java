package dev.baron.MovieTicketBooking.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {

    @Id // attribute id is primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id;
    
    private LocalDateTime CreatedAt;
    
    private LocalDateTime UpdatedAt;
    
    private String createdBy;

    private String updatedBy;

}
