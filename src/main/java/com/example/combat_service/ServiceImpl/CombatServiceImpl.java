package com.example.combat_service.ServiceImpl;

import com.example.combat_service.Model.CombatAction;
import com.example.combat_service.Model.CombatResult;
import com.example.combat_service.Model.CombatSession;
import com.example.combat_service.Repository.CombatSessionRepository;
import com.example.combat_service.Service.CombatLogService;
import com.example.combat_service.Service.CombatResultService;
import com.example.combat_service.Service.CombatService;
import com.example.combat_service.Service.CombatValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombatServiceImpl implements CombatService {

    @Autowired
    private CombatSessionRepository combatSessionRepository;

    @Autowired
    private CombatLogService combatLogService;

    @Autowired
    private CombatResultService combatResultService;

    @Autowired
    private CombatValidationService combatValidationService;

    @Override
    public Long initiateCombatSession(Long playerId, Long monsterId) {
        // Create a new combat session
        CombatSession session = new CombatSession(playerId, monsterId);
        combatSessionRepository.save(session);
        return session.getId();
    }

    @Override
    public void processCombatAction(Long sessionId, CombatAction action) {

    }

/*    @Override
    public void processCombatAction(Long sessionId, CombatAction action) {
        // Retrieve the combat session
        CombatSession session = combatSessionRepository.findById(sessionId)
                .orElseThrow(() -> new IllegalArgumentException("Combat session not found"));

        // Validate the combat action
        combatValidationService.validateCombatAction(session.getPlayerId(), session.getMonsterId(), action);

        // Process the combat action and update session state
        if ("attack".equalsIgnoreCase(action.getActionType().toString())) {
            int damage = calculateDamage(session.getPlayerId(), session.getMonsterId(), action);
            session.setMonsterHealth(session.getMonsterHealth() - damage);
        }
        // Add similar logic for other types of actions

        // Save the updated combat session
        combatSessionRepository.save(session);

        // Log the combat action
        combatLogService.logCombatAction(sessionId, action);
    }*/


    @Override
    public CombatSession getCombatSession(Long sessionId) {
        return combatSessionRepository.findById(sessionId)
                .orElseThrow(() -> new IllegalArgumentException("Combat session not found"));
    }

    @Override
    public CombatResult resolveCombat(Long sessionId) {
        return null;
    }

/*    @Override
    public CombatResult resolveCombat(Long sessionId) {
        // Retrieve the combat session
        CombatSession session = combatSessionRepository.findById(sessionId)
                .orElseThrow(() -> new IllegalArgumentException("Combat session not found"));

        // Resolve combat outcome
        CombatResult result = combatResultService.generateCombatResult(session);

        // Save the combat result
        combatResultService.saveCombatResult(result);

        // End the combat session
        endCombatSession(sessionId);

        return result;
    }*/

    @Override
    public void endCombatSession(Long sessionId) {
        // Clean up operations for ending the combat session
        combatSessionRepository.deleteById(sessionId);
        // Additional cleanup operations can be added as needed
    }

}
