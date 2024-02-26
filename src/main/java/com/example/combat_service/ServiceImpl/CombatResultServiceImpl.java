package com.example.combat_service.ServiceImpl;

import com.example.combat_service.Model.CombatResult;
import com.example.combat_service.Repository.CombatResultRepository;
import com.example.combat_service.Service.CombatResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombatResultServiceImpl implements CombatResultService {

    @Autowired
    private CombatResultRepository combatResultRepository;

    @Override
    public CombatResult saveCombatResult(CombatResult combatResult) {
        return combatResultRepository.save(combatResult);
    }

    @Override
    public CombatResult getCombatResultById(Long id) {
        return combatResultRepository.findById(id).orElse(null);
    }

    @Override
    public List<CombatResult> getAllCombatResults() {
        return combatResultRepository.findAll();
    }

    @Override
    public List<CombatResult> getCombatResultsBySessionId(Long sessionId) {
        return combatResultRepository.findBySessionId(sessionId);
    }

    @Override
    public void deleteCombatResult(Long id) {
        combatResultRepository.deleteById(id);
    }
}
