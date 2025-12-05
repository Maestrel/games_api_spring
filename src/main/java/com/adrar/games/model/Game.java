package com.adrar.games.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name="game")
@Data
public class Game {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title", length = 50, nullable = false)
    private String title;

    @Column(name="type", length = 50, nullable = false)
    private String type;

    @Column(name="publish_at")
    private Date publishAt;

    @ManyToOne
    @JoinColumn(name = "console_id", nullable = false)
    private Console console;
}
