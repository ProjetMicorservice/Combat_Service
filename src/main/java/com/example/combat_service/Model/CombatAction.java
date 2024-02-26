package com.example.combat_service.Model;

public class CombatAction {
    private ActionType actionType;
    private Long initiatorId;
    private Long targetId;

    // Additional properties specific to certain action types

    public CombatAction(ActionType actionType, Long initiatorId, Long targetId) {
        this.actionType = actionType;
        this.initiatorId = initiatorId;
        this.targetId = targetId;
    }

    // Getters and setters for the properties

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public Long getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }
}

