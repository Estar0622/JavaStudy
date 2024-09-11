package com.example.WorldCup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorldCup {

    @Id
    @Column(name = "worldcup_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int worldCupId;

    private String title;

    private String image;

    private String description;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private String award;

    private int popular;

    @OneToMany(mappedBy = "worldCup")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "worldCup")
    private Set<Candidate> candidates;

    @OneToMany(mappedBy = "likePK.worldCup")
    private Set<Like> likes;
}

