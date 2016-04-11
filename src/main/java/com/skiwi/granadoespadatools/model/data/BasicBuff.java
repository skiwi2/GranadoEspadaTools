package com.skiwi.granadoespadatools.model.data;

import com.skiwi.granadoespadatools.model.interfaces.BuffData;
import com.skiwi.granadoespadatools.model.objects.Effect;
import com.skiwi.granadoespadatools.model.objects.EffectType;

import java.util.Arrays;
import java.util.List;

/**
 * @author Frank van Heeswijk
 */
public enum BasicBuff implements BuffData {
    SKILL_EVASION_LV1 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(new Effect(EffectType.SKILL_EVASION_PERCENTAGE, 3));
        }
    },
    ATK_LV1 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(new Effect(EffectType.ATK_PERCENTAGE, 3));
        }
    },
    INT_LV1 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(new Effect(EffectType.INT, 2));
        }
    },
    CHARACTER_BUFF_LV1 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(
                new Effect(EffectType.AR, 1),
                new Effect(EffectType.DR, 1)
            );
        }
    },
    TIERRA_DE_LA_SED_LV2 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(
                new Effect(EffectType.AR, 1),
                new Effect(EffectType.DR, 1),
                new Effect(EffectType.MAX_HP_PERCENTAGE, 10),
                new Effect(EffectType.MONSTER_DAMAGE_PERCENTAGE, 10),
                new Effect(EffectType.COMBAT_EXP_PERCENTAGE, 30),
                new Effect(EffectType.STANCE_EXP_PERCENTAGE, 20),
                new Effect(EffectType.ITEM_DROP_RATE_PERCENTAGE, 10)
            );
        }
    },
    FAMILY_ATTRIBUTE_SKIWI {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(
                new Effect(EffectType.ATK_PERCENTAGE, 30),
                new Effect(EffectType.ATK_SPD_PERCENTAGE, 30),
                new Effect(EffectType.MONSTER_DAMAGE_PERCENTAGE, 4),
                new Effect(EffectType.IF_ENEMY_BELOW_50_DAMAGE_INCREASE_PERCENTAGE, 10)
            );
        }
    },
    BLESSING_OF_FACTION_LV13 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(
                new Effect(EffectType.MONSTER_DAMAGE_PERCENTAGE, 39),
                new Effect(EffectType.STANCE_EXP_PERCENTAGE, 5)
            );
        }
    },
    CHILIARCH_LV5 {
        @Override
        public List<Effect> getEffects() {
            return Arrays.asList(
                new Effect(EffectType.ATK_PERCENTAGE, 5),
                new Effect(EffectType.DEF, 5),
                new Effect(EffectType.RES, 5),
                new Effect(EffectType.MAX_HP, 1500)
            );
        }
    };
}
