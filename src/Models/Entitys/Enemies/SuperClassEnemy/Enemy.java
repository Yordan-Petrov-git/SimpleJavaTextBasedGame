package Models.Entitys.Enemies.SuperClassEnemy;

import Models.Entitys.SuperClassEntity.Entity;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityClass;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityRace;

public class Enemy extends Entity {


    private double dropAmountExperience;
    private double dropAmountGold;
    private double dropAmountItems;

    public Enemy(String name, EnumEntityClass entityClass, EnumEntityRace entityRace, int entityLevel, double health, double mana, double stamina
            , double movementSpeed, double attackDamage, double abilityPower, double attackSpeed, double castingSpeed, double lifeSteal
            , double criticalChance, double lifeStealChance, double defence, double block, double parryChance, double hitChance
            , double missChance, double bleedResist, double slashResist, double punctureResist, double magickResist, double holyResist
            , double darkResist, double fireResist, double frostResist, double shockResist, double souls, double hunger, boolean isEntityBoss,
                 double dropAmountExperience, double dropAmountGold, double dropAmountItems) {

        super(name, entityClass, entityRace, entityLevel, health, mana, stamina
                , movementSpeed, attackDamage, abilityPower, attackSpeed, castingSpeed, lifeSteal
                , criticalChance, lifeStealChance, defence, block, parryChance, hitChance
                , missChance, bleedResist, slashResist, punctureResist, magickResist, holyResist
                , darkResist, fireResist, frostResist, shockResist, souls, hunger, isEntityBoss);

        setDropAmountExperience(dropAmountExperience);
        setDropAmountGold(dropAmountGold);
        setDropAmountItems(dropAmountItems);
    }

    public double getDropAmountExperience() {
        return this.dropAmountExperience;
    }

    public void setDropAmountExperience(double dropAmountExperience) {
        this.dropAmountExperience = dropAmountExperience;
    }

    public double getDropAmountGold() {
        return this.dropAmountGold;
    }

    public void setDropAmountGold(double dropAmountGold) {
        this.dropAmountGold = dropAmountGold;
    }

    public double getDropAmountItems() {
        return this.dropAmountItems;
    }

    public void setDropAmountItems(double dropAmountItems) {
        this.dropAmountItems = dropAmountItems;
    }
}
