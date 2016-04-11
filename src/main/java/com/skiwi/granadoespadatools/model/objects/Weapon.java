package com.skiwi.granadoespadatools.model.objects;

import com.skiwi.granadoespadatools.model.interfaces.WeaponData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public class Weapon {
    private final WeaponData weaponData;
    private final int enhancement;
    private final List<Effect> options = new ArrayList<>();
    private final List<Rumin> sockets = new ArrayList<>();

    public Weapon(WeaponData weaponData, int enhancement, List<Effect> options, List<Rumin> sockets) {
        this.weaponData = weaponData;
        this.enhancement = enhancement;
        this.options.addAll(options);
        this.sockets.addAll(sockets);
    }
}
