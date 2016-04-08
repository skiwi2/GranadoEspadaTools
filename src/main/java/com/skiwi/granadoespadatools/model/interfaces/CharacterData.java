package com.skiwi.granadoespadatools.model.interfaces;

import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public interface CharacterData {
    String getName();

    int getSTR();

    int getAGI();

    int getHP();

    int getDEX();

    int getINT();

    int getSEN();

    List<StanceData> getStances();
}
