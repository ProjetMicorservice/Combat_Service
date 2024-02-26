package com.example.combat_service.Repository;

import com.example.combat_service.Model.CombatLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CombatLogRepository extends JpaRepository<CombatLog, Long> {
    // You can define custom query methods here if needed
}