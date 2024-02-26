package com.example.combat_service.Service;

import com.example.combat_service.Model.CombatAction;

public interface CombatValidationService {

    /**
     * Validates if a combat action is valid.
     * @param sessionId The ID of the combat session.
     * @param playerId The ID of the player initiating the action.
     * @param action The combat action to validate.
     * @return true if the action is valid, false otherwise.
     */
    boolean validateCombatAction(Long sessionId, Long playerId, CombatAction action);

    /**
     * Validates if a combat session is in a valid state.
     * @param sessionId The ID of the combat session to validate.
     * @return true if the combat session is valid, false otherwise.
     */
    boolean validateCombatSession(Long sessionId);

    // You can add more validation methods as needed

}