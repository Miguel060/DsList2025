package com.miguelsd.dslist2025.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
@Getter
@Setter
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private Double score;
    private String genre;
    private String platforms;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {

    }

    public Game(Long id, String title, Integer year, Double score, String genre, String platforms, String imgUrl, String shorDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.score = score;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shorDescription;
        this.longDescription = longDescription;
    }

}
