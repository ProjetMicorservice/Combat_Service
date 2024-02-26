package com.example.combat_service.Service;

import com.example.combat_service.Model.CombatAction;
import com.example.combat_service.Model.CombatResult;
import com.example.combat_service.Model.CombatSession;

public interface CombatService {

    /**
     * Initiates a combat session between a player and a monster.
     *
     * @param playerId   The ID of the player participating in combat.
     * @param monsterId  The ID of the monster involved in combat.
     * @return The ID of the newly created combat session.
     */
    Long initiateCombatSession(Long playerId, Long monsterId);

    /**
     * Processes a combat action within the specified combat session.
     *
     * @param sessionId  The ID of the combat session.
     * @param action     The combat action to be processed.
     */
    void processCombatAction(Long sessionId, CombatAction action);

    /**
     * Retrieves the current state of the combat session.
     *
     * @param sessionId  The ID of the combat session.
     * @return The current state of the combat session.
     */
    CombatSession getCombatSession(Long sessionId);

    /**
     * Determines the outcome of the combat session and generates a combat result.
     *
     * @param sessionId  The ID of the combat session.
     * @return The combat result indicating the outcome of the combat session.
     */
    CombatResult resolveCombat(Long sessionId);

    /**
     * Ends the combat session and performs cleanup operations.
     *
     * @param sessionId  The ID of the combat session to be ended.
     */
    void endCombatSession(Long sessionId);
}
