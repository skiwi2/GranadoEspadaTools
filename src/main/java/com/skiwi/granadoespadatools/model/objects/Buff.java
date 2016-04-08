package com.skiwi.granadoespadatools.model.objects;

/**
 * @author Frank van Heeswijk
 */
public class Buff {
    private final BuffType buffType;
    private final int amount;

    public Buff(BuffType buffType, int amount) {
        this.buffType = buffType;
        this.amount = amount;
    }

    public BuffType getBuffType() {
        return buffType;
    }

    public int getAmount() {
        return amount;
    }
}
