package com.skiwi.granadoespadatools.main;

import com.skiwi.granadoespadatools.model.data.BasicCharacter;
import com.skiwi.granadoespadatools.model.objects.Character;
import com.skiwi.granadoespadatools.model.objects.CharacterLevel;
import com.skiwi.granadoespadatools.model.objects.Stat;
import com.skiwi.granadoespadatools.model.objects.StatBonus;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author Frank van Heeswijk
 */
public class Main {
    private void init() {
        Character calyce = new Character(BasicCharacter.CALYCE, CharacterLevel.HIGH_MASTER_2, BigDecimal.ZERO, true, Arrays.asList(new StatBonus(Stat.DEX, 30)));
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
