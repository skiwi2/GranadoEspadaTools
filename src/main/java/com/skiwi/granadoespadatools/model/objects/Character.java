package com.skiwi.granadoespadatools.model.objects;

import com.skiwi.granadoespadatools.model.interfaces.BuffData;
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

    private final List<BuffData> buffs = new ArrayList<>();

    private Weapon rightHandWeapon;
    private Weapon leftHandWeapon;

    public Character(CharacterData characterData, int level, BigDecimal levelPercentage, boolean hasLaAttencion, List<StatBonus> promotionStats) {
        this.characterData = characterData;
        this.level = level;
        this.levelPercentage = levelPercentage;
        this.hasLaAttencion = hasLaAttencion;
        this.promotionStats.addAll(promotionStats);
    }

    public void addBuff(BuffData buff) {
        this.buffs.add(buff);
    }

    public void setRightHandWeapon(Weapon rightHandWeapon) {
        this.rightHandWeapon = rightHandWeapon;
    }

    public void setLeftHandWeapon(Weapon leftHandWeapon) {
        this.leftHandWeapon = leftHandWeapon;
    }
}
