package com.skiwi.granadoespadatools.model.data;

import com.skiwi.granadoespadatools.model.interfaces.CharacterData;

/**
 * @author Frank van Heeswijk
 */
public enum  BasicCharacter implements CharacterData {
    CALYCE {
        @Override
        public String getName() {
            return "Calyce";
        }

        @Override
        public int getSTR() {
            return 50;
        }

        @Override
        public int getAGI() {
            return 70;
        }

        @Override
        public int getHP() {
            return 50;
        }

        @Override
        public int getDEX() {
            return 70;
        }

        @Override
        public int getINT() {
            return 30;
        }

        @Override
        public int getSEN() {
            return 60;
        }
    };
}
