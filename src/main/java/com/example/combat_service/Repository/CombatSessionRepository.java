package com.example.combat_service.Repository;

import com.example.combat_service.Model.CombatSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CombatSessionRepository extends JpaRepository<CombatSession, Long> {
    // You can define custom query methods here if needed
}
