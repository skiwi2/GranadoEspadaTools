package com.skiwi.granadoespadatools.model.interfaces;

import com.skiwi.granadoespadatools.model.objects.Effect;
import com.skiwi.granadoespadatools.model.objects.WeaponClass;
import com.skiwi.granadoespadatools.model.objects.WeaponSeries;
import com.skiwi.granadoespadatools.model.objects.WeaponType;

import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public interface WeaponData {
    WeaponClass getWeaponClass();

    WeaponType getWeaponType();

    WeaponSeries getWeaponSeries();

    int getAR();

    int getBaseAttack();

    List<Effect> getBaseEffects();
}
