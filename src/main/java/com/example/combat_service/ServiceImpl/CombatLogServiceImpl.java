package com.example.combat_service.ServiceImpl;

import com.example.combat_service.Model.CombatLog;
import com.example.combat_service.Repository.CombatLogRepository;
import com.example.combat_service.Service.CombatLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombatLogServiceImpl implements CombatLogService {

    @Autowired
    private CombatLogRepository combatLogRepository;

    @Override
    public Long createCombatLog(Long sessionId, String action, String details) {
        CombatLog combatLog = new CombatLog();
        combatLog.setSessionId(sessionId);
        combatLog.setAction(action);
        combatLog.setDetails(details);
        return combatLogRepository.save(combatLog).getId();
    }

    @Override
    public List<CombatLog> getCombatLogsBySessionId(Long sessionId) {
        return combatLogRepository.findBySessionId(sessionId);
    }

    @Override
    public void deleteCombatLogsBySessionId(Long sessionId) {
        combatLogRepository.deleteBySessionId(sessionId);
    }
}