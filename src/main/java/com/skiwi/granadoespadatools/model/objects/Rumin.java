package com.skiwi.granadoespadatools.model.objects;

/**
 * @author Frank van Heeswijk
 */
public enum Rumin {
    MAJOR_OBSIDIAN {
        @Override
        public Effect getEffect() {
            return new Effect(EffectType.ATK_PERCENTAGE, 5);
        }
    };

    public abstract Effect getEffect();
}
