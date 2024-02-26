package com.example.combat_service.Repository;

import com.example.combat_service.Model.CombatResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CombatResultRepository extends JpaRepository<CombatResult, Long> {
    // You can define custom query methods here if needed
}