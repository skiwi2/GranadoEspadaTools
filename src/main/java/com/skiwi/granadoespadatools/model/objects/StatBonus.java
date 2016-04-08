package com.skiwi.granadoespadatools.model.objects;

/**
 * @author Frank van Heeswijk
 */
public class StatBonus {
    private final Stat stat;
    private final int amount;

    public StatBonus(Stat stat, int amount) {
        this.stat = stat;
        this.amount = amount;
    }

    public Stat getStat() {
        return stat;
    }

    public int getAmount() {
        return amount;
    }
}
