package com.skiwi.granadoespadatools.model.data;

import com.skiwi.granadoespadatools.model.interfaces.WeaponEnhancementData;
import com.skiwi.granadoespadatools.model.objects.WeaponClass;

/**
 * @author Frank van Heeswijk
 */
public enum BasicWeaponEnhancement implements WeaponEnhancementData {
    CROSSBOW_ENHANCEMENT {
        @Override
        public WeaponClass getWeaponClass() {
            return WeaponClass.CROSSBOW;
        }

        @Override
        public int getExtraAR(int enhancement) {
            return Math.max(enhancement - 4, 0);
        }

        @Override
        public int getExtraAttack(int enhancement) {
            int extraAttack = 0;
            if (enhancement >= 1) {
                extraAttack += 5;
            }
            if (enhancement >= 2) {
                extraAttack += 5;
            }
            if (enhancement >= 3) {
                extraAttack += 5;
            }
            if (enhancement >= 4) {
                extraAttack += 5;
            }
            if (enhancement >= 5) {
                extraAttack += 6;
            }
            if (enhancement >= 6) {
                extraAttack += 7;
            }
            if (enhancement >= 7) {
                extraAttack += 8;
            }
            if (enhancement >= 8) {
                extraAttack += 10;
            }
            if (enhancement >= 9) {
                extraAttack += 12;
            }
            if (enhancement >= 10) {
                extraAttack += 14;
            }
            if (enhancement >= 11) {
                throw new IllegalStateException("Enhancements +11, +12 and +13 are not supported");
            }
            return extraAttack;
        }
    };
}
