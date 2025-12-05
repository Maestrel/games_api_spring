package com.adrar.games.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="console")
public class Console {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(length=50, name = "name", nullable = false)
    private String name;

    @Column(name="manufacturer", length = 50, nullable = false)
    private String manufacturer;
}
