package com.skiwi.granadoespadatools.model.interfaces;

import java.math.BigDecimal;

/**
 * @author Frank van Heeswijk
 */
public interface StanceData {
    String getName();

    int getHitsPerAttack();

    int getSPD();

    int getATK();

    int getACC();

    int getEVA();

    int getBLK();

    //TODO add level 25 bonuses
}
