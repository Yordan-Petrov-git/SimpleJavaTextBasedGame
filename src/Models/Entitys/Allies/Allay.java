package Models.Entitys.Allies;

import Models.Entitys.SuperClassEntity.Entity;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityClass;

public class Allay extends Entity {
    public Allay(String name, EnumEntityClass entityClass, int entityRace, int entityLevel, double health, double mana, double stamina, double movementSpeed, double attackDamage, double abilityPower, double attackSpeed, double castingSpeed, double lifeSteal, double criticalChance, double lifeStealChance, double defence, double block, double parryChance, double hitChance, double missChance, double bleedResist, double slashResist, double punctureResist, double magickResist, double holyResist, double darkResist, double fireResist, double frostResist, double shockResist, double souls, double hunger, boolean isEntityBoss) {
        super(name, entityClass, entityRace, entityLevel, health, mana, stamina, movementSpeed, attackDamage, abilityPower, attackSpeed, castingSpeed, lifeSteal, criticalChance, lifeStealChance, defence, block, parryChance, hitChance, missChance, bleedResist, slashResist, punctureResist, magickResist, holyResist, darkResist, fireResist, frostResist, shockResist, souls, hunger, isEntityBoss);
    }
}
