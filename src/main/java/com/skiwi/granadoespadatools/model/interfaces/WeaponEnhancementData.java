package com.skiwi.granadoespadatools.model.interfaces;

import com.skiwi.granadoespadatools.model.objects.WeaponClass;

/**
 * @author Frank van Heeswijk
 */
public interface WeaponEnhancementData {
    WeaponClass getWeaponClass();

    int getExtraAR(int enhancement);

    int getExtraAttack(int enhancement);
}
