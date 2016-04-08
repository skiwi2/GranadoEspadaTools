package com.skiwi.granadoespadatools.main;

import com.skiwi.granadoespadatools.model.data.BasicCharacter;
import com.skiwi.granadoespadatools.model.objects.Character;
import com.skiwi.granadoespadatools.model.objects.CharacterLevel;

import java.math.BigDecimal;

/**
 * @author Frank van Heeswijk
 */
public class Main {
    private void init() {
        Character calyce = new Character(BasicCharacter.CALYCE, CharacterLevel.HIGH_MASTER_2, BigDecimal.ZERO, true);
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
