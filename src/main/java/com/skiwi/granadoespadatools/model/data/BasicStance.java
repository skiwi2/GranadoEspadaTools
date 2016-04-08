package com.skiwi.granadoespadatools.model.data;

import com.skiwi.granadoespadatools.model.interfaces.StanceData;

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
    };
}
