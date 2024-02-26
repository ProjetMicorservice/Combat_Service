package com.example.combat_service.Service;

import com.example.combat_service.Model.CombatLog;

import java.util.List;

public interface CombatLogService {
    /**
     * Creates a new combat log for the specified combat session.
     *
     * @param sessionId The ID of the combat session.
     * @param action    The action performed during combat.
     * @param details   Additional details about the action.
     * @return The ID of the newly created combat log.
     */
    Long createCombatLog(Long sessionId, String action, String details);

    /**
     * Retrieves all combat logs for the specified combat session.
     *
     * @param sessionId The ID of the combat session.
     * @return A list of combat logs for the specified session.
     */
    List<CombatLog> getCombatLogsBySessionId(Long sessionId);

    /**
     * Deletes all combat logs associated with the specified combat session.
     *
     * @param sessionId The ID of the combat session.
     */
    void deleteCombatLogsBySessionId(Long sessionId);

    // You can add more methods as needed for managing combat logs
}
