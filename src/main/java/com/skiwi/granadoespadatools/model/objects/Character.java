package com.skiwi.granadoespadatools.model.objects;

import com.skiwi.granadoespadatools.model.interfaces.CharacterData;

import java.math.BigDecimal;

/**
 * @author Frank van Heeswijk
 */
public class Character {
    private final CharacterData characterData;
    private final int level;
    private final BigDecimal levelPercentage;
    private final boolean hasLaAttencion;

    public Character(CharacterData characterData, int level, BigDecimal levelPercentage, boolean hasLaAttencion) {
        this.characterData = characterData;
        this.level = level;
        this.levelPercentage = levelPercentage;
        this.hasLaAttencion = hasLaAttencion;
    }
}
