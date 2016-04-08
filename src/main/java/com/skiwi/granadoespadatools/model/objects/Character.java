package com.skiwi.granadoespadatools.model.objects;

import com.skiwi.granadoespadatools.model.interfaces.CharacterData;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public class Character {
    private final CharacterData characterData;
    private final int level;
    private final BigDecimal levelPercentage;
    private final boolean hasLaAttencion;
    private final List<StatBonus> promotionStats = new ArrayList<>();

    public Character(CharacterData characterData, int level, BigDecimal levelPercentage, boolean hasLaAttencion, List<StatBonus> promotionStats) {
        this.characterData = characterData;
        this.level = level;
        this.levelPercentage = levelPercentage;
        this.hasLaAttencion = hasLaAttencion;
        this.promotionStats.addAll(promotionStats);
    }
}
