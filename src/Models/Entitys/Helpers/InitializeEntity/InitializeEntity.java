package Models.Entitys.Helpers.InitializeEntity;

import Controller.Controller;
import Models.Entitys.Enemies.Monsters.Adventurer;
import Models.Entitys.Heroes.Hero;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityClass;
import Models.Entitys.SuperClassEntity.Enum.EnumEntityRace;

import java.util.Random;
import java.util.Scanner;

public class InitializeEntity extends Controller {

    public static Random random = new Random();

    public static Scanner in = new Scanner(System.in);

    public static void initializeEnemyMonsterAdventurer() {
        String nameAdventurer = "Adventurer";
        //TODO ADD ENUM TO ADVENTURER CLASS AND RACE
        EnumEntityClass entityClassAdventurer = null;
        EnumEntityRace entityRaceAdventurer = null;

        int entityLevelAdventurer= 1 + random.nextInt(2);
        double healthAdventurer= 10+ random.nextInt(5);
        double manaAdventurer= 5+ random.nextInt(1);
        double staminaAdventurer= 100+ random.nextInt(10);
        double movementSpeedAdventurer= 1 + random.nextInt(2);
        double attackDamageAdventurer= 10 + random.nextInt(5);
        double abilityPowerAdventurer= 1 + random.nextInt(10);
        double attackSpeedAdventurer= 1 + random.nextInt(2);
        double castingSpeedAdventurer= 1+ random.nextInt(1);
        double lifeStealAdventurer= 0;
        double criticalChanceAdventurer= 2 + random.nextInt(1);
        double lifeStealChanceAdventurer= 0;
        double defenceAdventurer= 10;
        double blockAdventurer= 5;
        double parryChanceAdventurer= 2;
        double hitChanceAdventurer= 5;
        double missChanceAdventurer= 3;
        double bleedResistAdventurer= 5;
        double slashResistAdventurer= 10;
        double punctureResistAdventurer= 1;
        double magickResistAdventurer= 0;
        double holyResistAdventurer= 0;
        double darkResistAdventurer= 0;
        double fireResistAdventurer= 1;
        double frostResistAdventurer= 2;
        double shockResistAdventurer= 1;
        double soulsAdventurer= 1;
        double hungerAdventurer= 0;
        boolean isAdventurerBoss = false;
        double dropAmountExperienceAdventurer= random.nextInt(3);
        double dropAmountGoldAdventurer =  random.nextInt(5);
        double dropAmountItemsAdventurer= random.nextInt(2);

        Adventurer adventurer = new Adventurer(nameAdventurer, entityClassAdventurer, entityRaceAdventurer, entityLevelAdventurer, healthAdventurer, manaAdventurer, staminaAdventurer, movementSpeedAdventurer,
                attackDamageAdventurer, abilityPowerAdventurer, attackSpeedAdventurer, castingSpeedAdventurer, lifeStealAdventurer, criticalChanceAdventurer, lifeStealChanceAdventurer, defenceAdventurer,
                blockAdventurer, parryChanceAdventurer, hitChanceAdventurer, missChanceAdventurer, bleedResistAdventurer, slashResistAdventurer, punctureResistAdventurer, magickResistAdventurer, holyResistAdventurer,
                darkResistAdventurer, fireResistAdventurer, frostResistAdventurer, shockResistAdventurer, soulsAdventurer, hungerAdventurer, isAdventurerBoss
                , dropAmountExperienceAdventurer, dropAmountGoldAdventurer, dropAmountItemsAdventurer);



    }

    public static void initializeHero() {


        String HeroName = "Unnamed";
        EnumEntityClass HeroClass = null;
        EnumEntityRace HeroRace = null ;
        int HeroLevel = 0;
        double HeroHealth = 100.0;
        double HeroMana = 0.0;
        double HeroStamina = 100.0;
        double HeroMovementSpeed = 0.0;
        double HeroAttackDamage = 0.0;
        double HeroAbilityPower = 0.0;
        double HeroAttackSpeed = 0.0;
        double HeroCastingSpeed = 0.0;
        double HeroLifeSteal = 0.0;
        double HeroCriticalChance = 0.0;
        double HeroLifeStealChance = 0.0;
        double HeroDefence = 0.0;
        double HeroBlock = 0.0;
        double HeroParryChance = 0.0;
        double HeroHitChance = 0.0;
        double HeroMissChance = 0.0;
        double HeroBleedResist = 0.0;
        double HeroSlashResist = 0.0;
        double HeroPunctureResist = 0.0;
        double HeroMagickResist = 0.0;
        double HeroHolyResist = 0.0;
        double HeroDarkResist = 0.0;
        double HeroFireResist = 0.0;
        double HeroFrostResist = 0.0;
        double HeroShockResist = 0.0;
        double HeroSouls = 1.0;
        double HeroHunger = 0.0;
        boolean isEntityBoss = false;


        System.out.println("        Welcome to the Dungeon Hero! ");
        System.out.println("\n\t>Enter your hero's name :   ");// hero naming and greating

        ;

        if (in.hasNextLine()) HeroName = in.nextLine();         // hero naming and greating
        System.out.println("\t> Hello " + HeroName + " Welcome to the adventure! ");// hero naming and greating
        // hero naming and greating


        System.out.println("Chose role for your hero");
        System.out.println(">1.DPS ");
        System.out.println(">2.Tank ");
        System.out.println(">3.Healer ");
        String clasin = in.nextLine();

        while (!clasin.equals("1") && !clasin.equals("2") && !clasin.equals("3")) {
            System.out.println(" Invalid command ! ");
            clasin = in.nextLine();
        }


        switch (clasin) {

            case "1":

                clasin = "DPS";
                String heroDPSclass = "DPS";

                boolean heroDPS = true;

                System.out.println("\t>You have chosen " + heroDPSclass + " role for your hero! ");
                HeroHealth += 100.00;
                HeroLevel += 1;
                HeroDefence += 25.00;
                HeroMana += 25;
                HeroStamina += 100 ;
                HeroAttackDamage += 30 ;
                HeroAbilityPower += 15 ;
//                heroGoldInInventory += 500;
                HeroCriticalChance += 3;
                break;

            case "2":
                clasin = "Tank";
                String heroTankclass = "Tank";
                int heroTank = 1;
                System.out.println("\t>You have chosen " + heroTankclass + " role for your hero! ");
//                health += 300 + rand.nextInt(60);
//                level += 1;
//                defence += 85;
//                mana += 10;
//                stamina += 10;
//                attackDamage += 2 + level;
//                abilityPower += 10 + level / 2;
//                heroGoldInInventory += 200;
//                heroCritChance += 1;
                break;

            case "3":        // hero lealer class
                clasin = "Healer";
                String heroHealerclass = "Healer";
//                int heroHealer = 1;
//                System.out.println("\t>You have chosen" + heroHealerclass + " role for your hero! ");
//                health += 150;
//                level += 1;
//                defence += 10;
//                mana += 100 + level + rand.nextInt(60);
//                stamina += 20;
//                attackDamage += 1 + level / 2;
//                abilityPower += 60 + level / 2;
//                heroGoldInInventory += 1;
//                heroCritChance += 2;
//                healFactorHealerClass = 10 + rand.nextInt(50) * level;
                break;


            default:
                System.out.println("\t> Invalid command please chose 1 , 2 , 3 , 4 , 5 or 6 ");
                break;
        }

        Hero hero = new Hero(HeroName, HeroClass, HeroRace, HeroLevel, HeroHealth, HeroMana, HeroStamina, HeroMovementSpeed,
                HeroAttackDamage, HeroAbilityPower, HeroAttackSpeed, HeroCastingSpeed, HeroLifeSteal, HeroCriticalChance, HeroLifeStealChance, HeroDefence,
                HeroBlock, HeroParryChance, HeroHitChance, HeroMissChance, HeroBleedResist, HeroSlashResist, HeroPunctureResist, HeroMagickResist, HeroHolyResist,
                HeroDarkResist, HeroFireResist, HeroFrostResist, HeroShockResist, HeroSouls, HeroHunger, isEntityBoss);

        Controller.currentHero = hero;

    }

}
