package com.example.WorldCup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidateId;

    private int vote;

    @ManyToOne
    @JoinColumn(name = "worldcup_id")
    private WorldCup worldCup;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
