package com.example.WorldCup.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikePK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "worldcup_id")
    private WorldCup worldCup;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
