package Models.Items.Weapons.RangedWeapons;

import Models.Items.Weapons.Weapon;

public class RangedWeapons extends Weapon {

    public double range;

    public RangedWeapons(String iDWeapon, double damage, double weight, double bleedDamage, double slashDamage
            , double punctureDamage, double magickDamage, double lifeStealDamage, double frostDamage
            , double shockDamage, double fireDamage, double darkDamage,double range) {

        super(iDWeapon, damage, weight, bleedDamage, slashDamage, punctureDamage, magickDamage, lifeStealDamage
                , frostDamage, shockDamage, fireDamage, darkDamage);

        setRange(range);

    }

    public double getRange() {
        return this.range;
    }

    public void setRange(double range) {
        this.range = range;
    }



}
