package com.example.combat_service.Service;

import com.example.combat_service.Model.CombatResult;

import java.util.List;

public interface CombatResultService {

    /**
     * Saves the combat result to the database.
     * @param combatResult The combat result to be saved.
     * @return The saved combat result.
     */
    CombatResult saveCombatResult(CombatResult combatResult);

    /**
     * Retrieves the combat result by its ID.
     * @param id The ID of the combat result.
     * @return The combat result with the specified ID, or null if not found.
     */
    CombatResult getCombatResultById(Long id);

    /**
     * Retrieves all combat results.
     * @return A list of all combat results.
     */
    List<CombatResult> getAllCombatResults();

    /**
     * Retrieves combat results for a specific combat session.
     * @param sessionId The ID of the combat session.
     * @return A list of combat results for the specified combat session.
     */
    List<CombatResult> getCombatResultsBySessionId(Long sessionId);

    /**
     * Deletes a combat result by its ID.
     * @param id The ID of the combat result to be deleted.
     */
    void deleteCombatResult(Long id);
}
