package com.skiwi.granadoespadatools.model.objects;

/**
 * @author Frank van Heeswijk
 */
public class Effect {
    private final EffectType effectType;
    private final int amount;

    public Effect(EffectType effectType, int amount) {
        this.effectType = effectType;
        this.amount = amount;
    }

    public EffectType getEffectType() {
        return effectType;
    }

    public int getAmount() {
        return amount;
    }
}
