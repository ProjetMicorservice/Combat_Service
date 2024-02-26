package com.example.combat_service.ServiceImpl;

import com.example.combat_service.Model.CombatAction;
import com.example.combat_service.Model.CombatSession;
import com.example.combat_service.Repository.CombatLogRepository;
import com.example.combat_service.Repository.CombatSessionRepository;
import com.example.combat_service.Service.CombatValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombatValidationServiceImpl implements CombatValidationService {

    @Autowired
    private CombatSessionRepository combatSessionRepository;

    @Autowired
    private CombatLogRepository combatLogRepository;

    @Override
    public boolean validateCombatAction(Long sessionId, Long playerId, CombatAction action) {
        // Check if the combat session exists
        CombatSession session = combatSessionRepository.findById(sessionId).orElse(null);
        if (session == null) {
            return false; // Session not found
        }

        // Check if the player is participating in the combat session
        if (!session.getPlayerId().equals(playerId)) {
            return false; // Player not part of the session
        }

        // Additional validation logic based on the specific action
        // For example, check if the player's action is valid based on game rules

        return true; // Action is valid
    }

    @Override
    public boolean validateCombatSession(Long sessionId) {
        // Check if the combat session exists
        CombatSession session = combatSessionRepository.findById(sessionId).orElse(null);
        if (session == null) {
            return false; // Session not found
        }

        // Additional validation logic for the overall state of the combat session
        // For example, check if both player and monster are alive, etc.

        return true; // Combat session is valid
    }

    // You can add more validation methods and additional dependencies as needed
}
