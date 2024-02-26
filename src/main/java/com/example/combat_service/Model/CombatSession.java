package com.example.combat_service.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CombatSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long playerId;
    private Long monsterId;
    private int playerHealth;
    private int monsterHealth;

    public CombatSession(Long playerId, Long monsterId) {
        this.playerId = playerId;
        this.monsterId = monsterId;
    }
}
