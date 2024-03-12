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
    @Column(name="ID")
    private int id;

    @Column(name="CREATED_AT")
    private LocalDateTime CreatedAt;

    @Column(name="UPDATED_AT")
    private LocalDateTime UpdatedAt;

    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="UPDATED_BY")
    private String updatedBy;

}
