package Models.Items.Weapons.CloseCombatWeapons;

import Models.Items.Weapons.Weapon;

public class CloseCombatWeapons extends Weapon {


    public CloseCombatWeapons(String iDWeapon, double damage, double weight, double bleedDamage, double slashDamage
            , double punctureDamage, double magickDamage, double lifeStealDamage, double frostDamage, double shockDamage
            , double fireDamage, double darkDamage) {

        super(iDWeapon, damage, weight, bleedDamage, slashDamage, punctureDamage, magickDamage, lifeStealDamage, frostDamage
                , shockDamage, fireDamage, darkDamage);
    }
}
