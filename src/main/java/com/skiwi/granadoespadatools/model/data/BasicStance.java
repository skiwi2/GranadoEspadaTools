package com.skiwi.granadoespadatools.model.data;

import com.skiwi.granadoespadatools.model.interfaces.StanceData;
import com.skiwi.granadoespadatools.model.objects.Buff;
import com.skiwi.granadoespadatools.model.objects.BuffType;

import java.util.Arrays;
import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public enum BasicStance implements StanceData {
    SHADOW_STING {
        @Override
        public String getName() {
            return "Shadow Sting";
        }

        @Override
        public int getHitsPerAttack() {
            return 2;
        }

        @Override
        public int getSPD() {
            return 220;
        }

        @Override
        public int getATK() {
            return 60;
        }

        @Override
        public int getACC() {
            return 30;
        }

        @Override
        public int getEVA() {
            return 0;
        }

        @Override
        public int getBLK() {
            return 0;
        }

        @Override
        public List<Buff> getLevel25Bonuses() {
            return Arrays.asList(
                new Buff(BuffType.SP_REGENERATION, 25),
                new Buff(BuffType.ACCURACY, 35),
                new Buff(BuffType.ATK_SPD_PERCENTAGE, 15),
                new Buff(BuffType.CRITICAL, 7),
                new Buff(BuffType.DEF_PENETRATION_RATE, 25)
            );
        }
    };
}
