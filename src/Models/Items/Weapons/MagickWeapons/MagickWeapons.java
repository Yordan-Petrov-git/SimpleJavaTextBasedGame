package Models.Items.Weapons.MagickWeapons;

import Models.Items.Weapons.Weapon;

public class MagickWeapons extends Weapon {

    public MagickWeapons(String iDWeapon, double damage, double weight, double bleedDamage, double slashDamage
            , double punctureDamage, double magickDamage, double lifeStealDamage, double frostDamage, double shockDamage
            , double fireDamage, double darkDamage) {

        super(iDWeapon, damage, weight, bleedDamage, slashDamage, punctureDamage, magickDamage, lifeStealDamage
                , frostDamage, shockDamage, fireDamage, darkDamage);
    }
}
