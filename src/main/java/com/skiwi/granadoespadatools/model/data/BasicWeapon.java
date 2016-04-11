package com.skiwi.granadoespadatools.model.data;

import com.skiwi.granadoespadatools.model.interfaces.WeaponData;
import com.skiwi.granadoespadatools.model.objects.Effect;
import com.skiwi.granadoespadatools.model.objects.EffectType;
import com.skiwi.granadoespadatools.model.objects.WeaponSeries;
import com.skiwi.granadoespadatools.model.objects.WeaponType;

import java.util.Arrays;
import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public enum  BasicWeapon implements WeaponData {
    ACCURACY_OF_PEGASUS {
        @Override
        public WeaponType getWeaponType() {
            return WeaponType.RANGED;
        }

        @Override
        public WeaponSeries getWeaponSeries() {
            return WeaponSeries.CONSTELLATION;
        }

        @Override
        public int getAR() {
            return 33;
        }

        @Override
        public int getBaseAttack() {
            return 369;
        }

        @Override
        public List<Effect> getBaseEffects() {
            return Arrays.asList(
                new Effect(EffectType.FIRE_PENETRATION_RATE, 5),
                new Effect(EffectType.ICE_PENETRATION_RATE, 5),
                new Effect(EffectType.LIGHTNING_PENETRATION_RATE, 5),
                new Effect(EffectType.MENTAL_PENETRATION_RATE, 5),
                new Effect(EffectType.DEF_PENETRATION_RATE, 5)
            );
        }
    };
}
