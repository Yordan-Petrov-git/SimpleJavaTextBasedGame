package Models.Entitys.Allies.NPC.Mercenary;

import Models.Entitys.Allies.Allay;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityClass;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityRace;

public class Mercenary extends Allay {

    private double hirePrice;

    public Mercenary(String name, EnumEntityClass entityClass, EnumEntityRace entityRace, int entityLevel, double health, double mana
            , double stamina, double movementSpeed, double attackDamage, double abilityPower, double attackSpeed
            , double castingSpeed, double lifeSteal, double criticalChance, double lifeStealChance, double defence
            , double block, double parryChance, double hitChance, double missChance, double bleedResist, double slashResist
            , double punctureResist, double magickResist, double holyResist, double darkResist, double fireResist, double frostResist
            , double shockResist, double souls, double hunger, boolean isEntityBoss, double hirePrice) {

        super(name, entityClass, entityRace, entityLevel, health, mana, stamina, movementSpeed, attackDamage, abilityPower, attackSpeed
                , castingSpeed, lifeSteal, criticalChance, lifeStealChance, defence, block, parryChance, hitChance, missChance, bleedResist
                , slashResist, punctureResist, magickResist, holyResist, darkResist, fireResist, frostResist, shockResist, souls, hunger
                , isEntityBoss);

        setHirePrice(hirePrice);
    }

    public double getHirePrice() {
        return this.hirePrice;
    }

    public void setHirePrice(double hirePrice) {
        this.hirePrice = hirePrice;
    }


}
