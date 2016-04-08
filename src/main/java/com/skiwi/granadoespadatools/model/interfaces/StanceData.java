package com.skiwi.granadoespadatools.model.interfaces;

import com.skiwi.granadoespadatools.model.objects.Buff;

import java.math.BigDecimal;
import java.util.List;

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

    List<Buff> getLevel25Bonuses();
}
