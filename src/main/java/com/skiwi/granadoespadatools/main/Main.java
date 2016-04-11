package com.skiwi.granadoespadatools.main;

import com.skiwi.granadoespadatools.model.data.BasicCharacter;
import com.skiwi.granadoespadatools.model.data.BasicWeapon;
import com.skiwi.granadoespadatools.model.objects.Character;
import com.skiwi.granadoespadatools.model.objects.CharacterLevel;
import com.skiwi.granadoespadatools.model.objects.Effect;
import com.skiwi.granadoespadatools.model.objects.EffectType;
import com.skiwi.granadoespadatools.model.objects.Rumin;
import com.skiwi.granadoespadatools.model.objects.Stat;
import com.skiwi.granadoespadatools.model.objects.StatBonus;
import com.skiwi.granadoespadatools.model.objects.Weapon;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author Frank van Heeswijk
 */
public class Main {
    private void init() {
        Character calyce = new Character(BasicCharacter.CALYCE, CharacterLevel.HIGH_MASTER_2, BigDecimal.ZERO, true, Arrays.asList(new StatBonus(Stat.DEX, 30)));

        Weapon rightHandCrossbow = new Weapon(BasicWeapon.ACCURACY_OF_PEGASUS, 6, Arrays.asList(
            new Effect(EffectType.ATK_PERCENTAGE, 38),
            new Effect(EffectType.ATK_SPD_PERCENTAGE, 27),
            new Effect(EffectType.CRITICAL, 4),
            new Effect(EffectType.ACCURACY, 9),
            new Effect(EffectType.AR, 2),
            new Effect(EffectType.DEMONS_PERCENTAGE, 55)
        ), Arrays.asList(Rumin.MAJOR_OBSIDIAN));

        calyce.setRightHandWeapon(rightHandCrossbow);
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
