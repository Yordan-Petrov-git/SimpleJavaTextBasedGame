import java.util.Random;
import java.util.Scanner;

public class Main {



        public static void main(String[] args) {

            //system objects
            Scanner in = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
            Random rand = new Random();
            //Game variables
            //enemy variables
            String[] enemies = {"Skeleton", "Miner", "Warlock", "Mage", "Zombie", "Demon", "Treasure_Hunter", "Adventurer", "Orc"}; // enemy names types clases
            String[] enemyRoles = {"Tank", "DPS", "Healer"};//tank mele and heal  , dps raanged and mele and spells , healer heal and mele
            //  String[] enemyRangedWeapons = {"Short_bow", "Long_bow", "Sling", "Crossbow", "Throwing_dagger", "Throwing_axe", "Throwing_spear"};
            // String[] enemyMeleWeapons = {"Axe", "Dagger", "Short_dagger", "Long_dagger", "Short_sword", "Long_sword", "Lance", "Trydent", "Spear", "Mace"};
            //  String[] enemyDarkSpells = {"Chaos bolt", "Arcane blast", "Arcane missles", "Fire blast", "Lightning strike"};
            ///   String[] enemyHolySpells = {"Lesser Heal", "Greater heal", "Exorcism"};
            //    String[] enemyRace = {"Undead", "Spectre", "Human", "Imperial", "Nord"};
            // String[] enemyAbilities = {" ", "  ", " ", " ", " "};


            // XP different enemy tipes
            int enemySkeletonXpAmmount = 5; //skeleton
            int enemyMinerXpAmmount = 6; // miner
            int enemyWarlockXpAmmount = 10; // warlock
            int enemyMageXpAmmount = 10; // mage
            int enemyZombieXpAmmount = 5; //zombie
            int enemyDemonXpAmmount = 9; //demon
            int enemyTreasure_HunterXpAmmount = 4; // treasure hunter
            int enemyAdventurerXpAmmount = 3; // adventurer
            int enemyOrcXpAmmount = 6; // ork

            //damage ranged  weapons
            int enemyShort_bowDamage = 2; // short bow
            int enemyLong_bowDamage = 4; // long bow
            int enemySlingDamage = 1; // sling
            int enemyCrossbowDamage = 6; // crosbow
            int enemyThrowing_daggerDamage = 2; //throwing dagger
            int enemyThrowing_axeDamage = 4;// throwing axe
            int enemyThrowing_spearDamage = 5;// throwing spear
            //damage ranged  weapons

            //mele weapons int enemy
            int enemyAxeDamage = 5; //axe
            int enemyDaggerDamage = 3;  // dagger
            int enemyShort_daggerDamage = 2; // short dagger
            int enemyLong_daggerDamage = 4; // long dagger
            int enemyShort_swordDamage = 5; // short sword
            int enemyLong_swordDamage = 7; // long sword
            int enemyLanceDamage = 7;// lance
            int enemyTrydentDamage = 6; // trydent
            int enemySpearDamage = 6; //spear
            int enemyMaceDamage = 8;//mace
            //mele weapons int enemy

            //enemy armor ratings
            int enemyHeadArmor = 50;
            int enemyChestArmor = 50;
            int enemyLegsArmor = 50;
            int enemyShield = 50;
            int enemyWeapon = 50;

            // enemy health  mana
            int maxEnemyHealth = 100;
            int maxEnemyMana = 100;
            int maxEnemyStamina = 100;

            //enemey attack ratings
            int enemyAttackDamage = 20;
            int enemyAbilityPower = 25;
            int enemyCritChance = 2;
            int enemyParryChance = 5;
            int enemyHitChance = 5;
            int enemyMissChance = 5;
            int enemyLifestealChance = 5;
            int enemyLifesteal = 5;
            //enemy resistances
            int enemyDefence = 50;
            int enemyBleedResist = 50;
            int enemySlashResist = 50;
            int enemyPunctureResist = 50;
            //enemy magick resistances
            int enemyMagicktResist = 50;
            int enemyHolyResist = 50;
            int enemyDarkResist = 50;
            // enemy elemental resistances
            int enemyFireResist = 50;
            int enemyFrostResist = 50;
            int enemyShockResist = 50;
            //enemy level

            // int enemyLevel = 1;
            int enemyBossStatus = 0; // if the enemy is a boss or normal
            int enemyMobStatus = 1; // if the enemy is a mob

            // emeny death drop
            int enemyExpDropChance = 50;// enemy exp afhter death
            int enemyMaxLevel = 100;
            int enemyMaxExpDrop = 10;
            int ennemyDropSoulChance = 25; // mechanick woth soul collection from enemies
            int maxEnnemyDropSoulS = 10;
            int ennemyGoldDropChance = 30;//mechanick with gold drop cnace
            int maxEnnemyGoldDrop = 100;
            int ennemyItemDropChance = 15;//mechanick with item drop
            int ennemyItemDrop = 1;

            //Player variables
            // based on race and starting class
            //  String[] heroClass = {"Warrior", "Knight", "Shaman", "Cultist", "Warlock", "Witcher", "Archer", "Mage"};
            //  String[] heroRace = {"Nord", "Imperial", "Argonian", "Elf", "Dark Elf", "Blood Elf", "Ork", "Human", "Demon"};
            //  String[] heroArmor = {"No armor", "Mail armor", "Heavy plate armor", "Plate armor", "Lether armor", "Hide armor", "Chainmail", "Bone armor", "Items.Clothes.Clothes", "Mage clothes", "Rags"};
            //  String[] rangedWeaponsHero = {"Short bow", "Long bow", "Sling", "Crossbow", "Throwing dagger", "Throwing axe", "Throwing spear"};
            //  String[] meleWeaponsHero = {"Axe", "Dagger", "Short dagger", "Long dagger", "Short sword", "Long sword", "Lance", "Trydent", "Spear", "Mace"};
            //  String[] heroRoles = {"Tank", "DPS", "Healer"};
            //String name = "Please enter your heros name";
            //  String heroRole = "Please select a role";

            //add resistances and armors and shield and weapons and spells and passives for classes and races
            int health = 500;
            int mana = 500;
            int stamina = 200;

            int enemyDefeatedCounter = 0;//boss counter maybe



            int attackDamage = 10; // raw unleveled unarmed attack dammage afther resistances armors and shields.
            int abilityPower = 15; //magick attack dammage and heal and buff ammount

            int level = 1;


            int heroWeapon = 1;
            int heroCritChance = 0 + level + rand.nextInt(1);
            int heroParryChance = 5;
            int heroHitChance = 5;
            int heroMissChance = 5;
            int heroLifestealChance = 0;
            int heroLifesteal = 0;

            int defence = 5;
            int armor = 5;
            int heroBleedResist = 5;
            int heroSlashResist = 5;
            int heroPunctureResist = 5;
            //enemy magick resistances
            int heroMagicktResist = 5;
            int heroHolyResist = 5;
            int heroDarkResist = 5;
            // enemy elemental resistances
            int heroFireResist = 5;
            int heroFrostResist = 5;
            int heroShockResist = 5;
            // hero armor ratings
            int heroHeadArmor = 5;
            int heroChestArmor = 5;
            int heroLegsArmor = 5;
            int heroShield = 5;
            // hero level

            //hero inventory
            double heroExp = 0.0;
            int heroGoldInInventory = 50;
            int heroSouls = 1;

            int numHealthPotions = 5; // health potions in inventory
            int healthPotionHealAmmount = 30; // health potion heal ammount
            int healthPotionDropChance = 50;  // percentage

            int numManaPotions = 5; // mana potions in inventory
            int manaPotionManaAmmount = 30; // mana potion mana add admmount
            int ManaPotionDropChance = 50; // percentage

            int numStaminaPotions = 5;
            int staminaPotionStaminaAmmount = 30;
            int staminaPotionDropChance = 50;


            int healFactorHealerClass =1;

            boolean running = true;

            System.out.println("        Welcome to the Dungeon Hero! "); // Welcome mesage if the game has started



            // hero naming and greating
            System.out.println(    "\n\t>Enter your hero's name :   ");// hero naming and greating
            String name = "Defaut";
            if(in.hasNextLine()== true )  name = in.nextLine();         // hero naming and greating
            System.out.println("\t> Hello " + name + " Welcome to the adventure! ");// hero naming and greating
            // hero naming and greating


            System.out.println("Chose role for your hero");
            System.out.println(">1.DPS ");
            System.out.println(">2.Tank ");
            System.out.println(">3.Healer ");

            String clasin = in.nextLine();
            while (!clasin.equals("1") && !clasin.equals("2") && !clasin.equals("3") ) {
                System.out.println(" Invalid command ! ");
                clasin = in.nextLine();
            }


            switch (clasin) {

                case "1":

                    clasin = "DPS";
                    String heroDPSclass = "DPS";

                    boolean heroDPS = true;

                    System.out.println("\t>You have chosen " + heroDPSclass + " role for your hero! ");
                    health += 100;
                    level += 1;
                    defence +=25;
                    mana +=25;
                    stamina += 100+ rand.nextInt(60);
                    attackDamage += 30 + level+ rand.nextInt(5);
                    abilityPower += 15 + level/2;
                    heroGoldInInventory +=500;
                    heroCritChance += 3;
                    break;

                case "2":
                    clasin = "Tank";
                    String heroTankclass = "Tank";
                    int heroTank = 1;
                    System.out.println("\t>You have chosen " + heroTankclass + " role for your hero! ");
                    health += 300+ rand.nextInt(60);
                    level += 1;
                    defence +=85;
                    mana +=10;
                    stamina +=10;
                    attackDamage +=2 + level;
                    abilityPower += 10 + level/2;
                    heroGoldInInventory +=200;
                    heroCritChance += 1;
                    break;

                case "3":        // hero lealer class
                    clasin = "Healer";
                    String heroHealerclass = "Healer";
                    int heroHealer = 1;
                    System.out.println("\t>You have chosen" + heroHealerclass + " role for your hero! ");
                    health += 150;
                    level += 1;
                    defence +=10;
                    mana +=100+level+ rand.nextInt(60);
                    stamina +=20;
                    attackDamage +=1 + level/2;
                    abilityPower += 60 + level/2;
                    heroGoldInInventory +=1;
                    heroCritChance += 2;
                    healFactorHealerClass = 10 + rand.nextInt(50)*level;
                    break;



                default:
                    System.out.println("\t> Invalid command please chose 1 , 2 , 3 , 4 , 5 or 6 ");
                    break;
            }




            OUTER_1:// Label of the game
            while (running) {// the whole game running





                System.out.println("-----------------------------------------------");

                int enemyCrit = rand.nextInt(enemyCritChance);
                int enemyDef = rand.nextInt(enemyDefence);
                int enemyLevel = rand.nextInt(enemyMaxLevel);
                int enemyHealth = rand.nextInt(maxEnemyHealth + enemyLevel);
                if (enemyHealth <= 0 ) {// make sure that the enemy is not dead
                    // code block to be executed
                    continue OUTER_1;
                }
                if (enemyLevel <= 0 ) {// makes sure that the enemy is not 0 level at
                    // code block to be executed
                    continue OUTER_1;
                }
                int enemyMana = rand.nextInt(maxEnemyMana );//random mana value
                int enemyStamina = rand.nextInt(maxEnemyStamina);// random stamina value
                int enemyAP =  rand.nextInt(enemyAbilityPower);

                String enemy = enemies[rand.nextInt(enemies.length)];    //random enemy type form string   inicializing enemy

                String enemyRole = enemyRoles[rand.nextInt(enemyRoles.length)]; // inicializin enemyRole random from aray enemyRoless

                if (enemyStamina <= 0 ) {// if enemy is spawned with 0 stamina ther run away
                    System.out.println("\t# " + enemy + "ran away ");
                    continue OUTER_1; // continues to outer 1
                }


                
                switch (enemyRole) {  // enemy role bonuses switch

                    case "DPS":         // dps bonus

                        enemyHealth += 5;
                        enemyLevel += 1;
                        enemyDef +=1;
                        enemyMana +=5+ rand.nextInt(10);
                        enemyStamina += 10 + rand.nextInt(10);
                        enemyAttackDamage += enemyAttackDamage +10+level/4;
                        enemyAP += 1 + level/2;
                        ennemyGoldDropChance +=15;
                        enemyCrit += 2;
                        break;

                    case "Tank":                   // tank bonus

                        enemyHealth += 60;
                        enemyLevel += 1;
                        enemyDef +=50;
                        enemyMana +=2;
                        enemyStamina +=1;
                        enemyAttackDamage +=1 + level/4;
                        enemyAP += 5 + level/2;
                        ennemyGoldDropChance +=50;
                        enemyCrit += 1;
                        break;

                    case "Healer":               // healer bonus


                        enemyHealth += 5;
                        enemyLevel += 2;
                        enemyDef +=5;
                        enemyMana +=200;
                        enemyStamina +=5;
                        enemyAttackDamage +=1 ;
                        enemyAP += 40+level/2;
                        ennemyGoldDropChance +=110;
                        enemyCrit += 1;
                        break;



                    default:  // defaut state
                        System.out.println("\t> Enemy class Error ");
                        break;
                }









                System.out.println("\t# " + enemy + " has appeared! #\n");// displays the enemy type

                if (enemyBossStatus == 1){
                    enemyLevel+=20;
                    enemyHealth+=200+level;
                    enemyDef +=20+level;
                    enemyMana +=100+level;
                    enemyStamina +=100+level;
                    enemyAttackDamage +=2+level ;
                    enemyAP += 10+level;
                    ennemyGoldDropChance +=700+level;
                    enemyCrit += 2;

                }



                OUTER://shows info
                while (enemyHealth > 0) {



                    if (enemyDefeatedCounter >= 10){
                        enemyBossStatus = 1;
                        enemyMobStatus = 0;
                    }else{
                        enemyBossStatus = 0;
                        enemyMobStatus = 1;
                    }


//
//                 if (enemyBossStatus = true ){
//                     enemyHealth+= 300;
//                     enemyMana+= 200;
//                     enemyStamina+= 300;
//                             enemyDef+= 50;
//            }


                    System.out.println("-----------------------------------------------");
                    System.out.println("\tYour HP:" + health);
                    System.out.println("\tYour Mana:" + mana);
                    System.out.println("\tYour Stamina:" + stamina);
                    System.out.println("\tYour Items.Armour.Armour rating:" + defence);
                    System.out.println("\tYour Damage rating is :" + attackDamage);
                    System.out.println("\tYour CritChance rating is :" + heroCritChance);
                    System.out.println("\tYour Abillity Power rating is :" + abilityPower);
                    System.out.println("\tYour hero class:" + clasin );
                    System.out.println("\tYour Level is :" + level);
                    System.out.println("\tYou " + name + " have " + heroExp + " Xp ");
                    System.out.println("\tYou " + name + " have " + heroSouls + " Soul(s)");
                    System.out.println("\tYou " + name + " have " +  heroGoldInInventory + " Gold ");
                    System.out.println("-----------------------------------------------");
                    System.out.println("\t" + enemy + " 's role is:" + enemyRole);
                    System.out.println("\t" + enemy + " 's HP:" + enemyHealth);
                    System.out.println("\t" + enemy + " 's Mana:" + enemyMana);
                    System.out.println("\t" + enemy + " 's Stamina:" + enemyStamina);
                    System.out.println("\t" + enemy + " 's Items.Armour.Armour:" + enemyDef);

                    if (enemyBossStatus == 1 &&  enemyMobStatus == 0){
                        System.out.println("\t" + enemy + " is a Boss beware !!! ");
                    }else{
                        System.out.println("\t" + enemy + " is a random vilan beware ! ");
                    }



                    System.out.println("\tYour Enemy's level :" + enemyLevel);
                    System.out.println("-----------------------------------------------");
                    System.out.println("\n\tWhat would you like to do? ");
                    System.out.println("                                                ");
                    System.out.println("\t1. Attack with mele!");
                    System.out.println("\t2. Dark magick attack ! !");// damage heals bufs new menu possibly
                    System.out.println("\t3. Heling spell !");// damage heals bufs new menu possibly
                    System.out.println("\t4. Drink Health Potion!");
                    System.out.println("\t5. Drink Mana Potion!");
                    System.out.println("\t6. Drink Stamina Potion!");
                    System.out.println("\t7. Check my inventory !");
                    System.out.println("\t8. Run Away !");

                    String input = in.nextLine();//scanner for menu 1 input form keuboard

                    switch (input) {//cases for menu 1
                        // initializing combat and damage

                        case "1":// initializing mele clolse range combat and damage takinga
                            // if for attacking the enemy






                            int damageDealt  = rand.nextInt(attackDamage); //hero ral random atak damage
                            int damageTaken = rand.nextInt(enemyAttackDamage); // enemy real random max atack damage






                            //STAMINA DRAIN HERO
                            if (stamina >5 ) {//STAMINA DRAIN HERO
                                stamina -= 5;//STAMINA DRAIN HERO
                            }else{//STAMINA DRAIN HERO
                                stamina = 0;//STAMINA DRAIN HERO
                                damageDealt = 5;
                                health -=1;
                            }             //STAMINA DRAIN HERO
                            //STAMINA DRAIN HERO

                            //STAMINA DRAIN ENEMY
                            if (enemyStamina >5 ) { //STAMINA DRAIN ENEMY
                                enemyStamina -= 5; //STAMINA DRAIN ENEMY
                            }else{ //STAMINA DRAIN ENEMY
                                enemyStamina = 0;
                                enemyHealth -= 4 + enemyLevel/4;//STAMINA DRAIN ENEMY
                                damageDealt += enemyLevel ;
                                damageTaken -= 5 ;
                            }   //STAMINA DRAIN ENEMY

                            //enemy damage dealing


                            //     IF CLASS HANDLER
                            if("Healer".equals(enemyRole)&&enemyHealth<=20&&enemyMana >60){ // IF CLASS HANDLER
                                enemyHealth +=60;
                                enemyMana -= 20;
                                System.out.println("\t > You enemy " + enemy + " healed for 60HP");
                            }
                            else if ("Healer".equals(enemyRole)&&enemyHealth<=20&&enemyMana >40){
                                enemyHealth +=40;
                                enemyMana -= 15;
                                System.out.println("\t > You enemy " + enemy + " healed for 15HP");
                            } else if ("Healer".equals(enemyRole)&&enemyHealth<=20&&enemyMana >5){
                                enemyHealth +=10;
                                enemyMana -= 5;
                                System.out.println("\t > You enemy " + enemy + " healed for 10HP");

                            }
                            // IF CLASS HANDLER
                            if("DPS".equals(enemyRole)&&health<=20&&enemyStamina >30){ // IF CLASS HANDLER EXECUTE DPS ABILITY
                                health -=40;
                                enemyStamina -= 20;
                                System.out.println("\t > You enemy " + enemy + " dealet 40 execute damage");
                            }
                            else if ("DPS".equals(enemyRole)&&health<=20&&enemyStamina >20){
                                health -=20;
                                enemyStamina -= 15;
                                System.out.println("\t > You enemy " + enemy + " dealet 20 execute damage");
                            } else if ("DPS".equals(enemyRole)&&health<=20&&enemyStamina >5){
                                health -=10;
                                enemyStamina -= 5;
                                System.out.println("\t > You enemy " + enemy + " dealet 10 execute damage");

                            }




                            health -= damageTaken; //enemy damage dealing
                            System.out.println("\t > You strike the " + enemy + " for " + damageDealt + " damage."); //enemy damage dealing
                            System.out.println("\t > You recived " + damageTaken + "in retaliation!"); //enemy damage dealing
                            //enemy damage dealing







                            //hero death
                            if (health < 1) { //hero death
                                System.out.println("\t> You have taken too much damage, you are too weak to go on! "); //hero death message
                                break OUTER; //hero death
                            } //hero death



                            // hero stamina drain
                            if (stamina > 1) {   // hero stamina drain


                                enemyHealth -=damageDealt*heroCritChance+level/2;// enemy damage dealing



//
                            }else{   // hero stamina drain
                                System.out.println("\t> You are too tired to go on drink stamina potion now or else! ");// hero stamina drain
                                health -= damageTaken;// hero stamina drain
                                System.out.println("\t> You have taken" + damageTaken  +" damage but you managed to run away form " + enemy + "!"); // hero stamina drain
                                continue OUTER_1;   // hero stamina drain
                            }   break;   // hero stamina drain
                        // hero stamina drain


                        case "2":  // magick attack

                            System.out.println("\ta. Dark magick attack !");

                            int apDamageDealt = rand.nextInt(abilityPower); // hero ap damage
                            int apDamageTaken = rand.nextInt(enemyAP);// vilan ap damage
                            int aamageTaken = rand.nextInt(enemyAttackDamage);//vilan atack damage

                            //mana DRAIN HERO
                            if (mana >10) {//mana DRAIN HERO
                                mana -=10;//mana DRAIN HERO
                                enemyHealth -=apDamageDealt ;



                            }else{//mana DRAIN HERO
                                //mana DRAIN HERO
                                apDamageDealt = 0;
                                System.out.println("\t Not ehought mana !");
                                break;
                            }             //mana DRAIN HERO
                            //mana DRAIN HERO
                            //mana DRAIN ENEMY
                            if (enemyMana >10) { //mana DRAIN ENEMY
                                enemyMana -= 10 ; //mana DRAIN ENEMY
                                health -= apDamageTaken;
                            }else{ //enemyMana DRAIN ENEMY

                                apDamageTaken = 0;

                                if (enemyStamina >5 ) { //STAMINA DRAIN ENEMY
                                    enemyStamina -= 5; //STAMINA DRAIN ENEMY
                                    health -= aamageTaken;
                                    System.out.println("\t > You recived " + aamageTaken + "mele damage");// dealing
                                }else{ //STAMINA DRAIN ENEMY

                                    enemyHealth -= 4 + enemyLevel/4;//STAMINA DRAIN ENEMY
                                }   //STAMINA DRAIN ENEMY
                                //ENEMY CANNOT USE SPELLS ANYMOORE
                            }

                            //s    IF CLASS HANDLER
                            if("Healer".equals(enemyRole)&&enemyHealth<=20&&enemyMana >60){ // IF CLASS HANDLER
                                enemyHealth +=60;
                                enemyMana -= 20;
                                System.out.println("\t > You enemy " + enemy + " healed for 60HP");
                            }
                            else if ("Healer".equals(enemyRole)&&enemyHealth<=20&&enemyMana >40){
                                enemyHealth +=40;
                                enemyMana -= 15;
                                System.out.println("\t > You enemy " + enemy + " healed for 15HP");
                            } else if ("Healer".equals(enemyRole)&&enemyHealth<=20&&enemyMana >5){
                                enemyHealth +=10;
                                enemyMana -= 5;
                                System.out.println("\t > You enemy " + enemy + " healed for 10HP");

                            }
                            // IF CLASS HANDLER
                            if("DPS".equals(enemyRole)&&health<=20&&enemyStamina >30){ // IF CLASS HANDLER EXECUTE DPS ABILITY
                                health -=40;
                                enemyStamina -= 20;
                                System.out.println("\t > You enemy " + enemy + " dealet 40 execute damage");
                            }
                            else if ("DPS".equals(enemyRole)&&health<=20&&enemyStamina >20){
                                health -=20;
                                enemyStamina -= 15;
                                System.out.println("\t > You enemy " + enemy + " dealet 20 execute damage");
                            } else if ("DPS".equals(enemyRole)&&health<=20&&enemyStamina >5){
                                health -=10;
                                enemyStamina -= 5;
                                System.out.println("\t > You enemy " + enemy + " dealet 10 execute damage");

                            }
                            //


                            System.out.println("\t > You cursed the " + enemy + " for " + apDamageDealt + " damage."); //enemy damage dealing
                            System.out.println("\t > You recived " + apDamageTaken + "in retaliation!"); //enemy damage dealing
                            //enemy damage dealing
                            //hero death
                            if (health < 1) { //hero death
                                System.out.println("\t> You have taken too much damage, you are too weak to go on! "); //hero death message
                                break OUTER; //hero death
                            } break;//hero death

                        case "3":// initializing Healing spell.

                            System.out.println("\t2. Healing power!");

                            int healFactor = rand.nextInt(abilityPower)/2;

                            //mana DRAIN HERO
                            if (mana >20  +  healFactorHealerClass) {//mana DRAIN HERO
                                mana -= 20 +  healFactorHealerClass ;//mana DRAIN HERO
                                health += healFactor ;
                                health +=   +healFactorHealerClass;


                                System.out.println("\t > You healed youself for  " + healFactor  );

                            }else{//mana DRAIN HERO

                                System.out.println("\t Not ehought mana !");
                                break;
                                //HERO CANNOT USE SPELLS ANYMOORE
                            } break;


                        // drink health potion
                        case "4":  // drink health potion
                            if (numHealthPotions > 0) {// drink health potion
                                health += healthPotionHealAmmount;// drink health potion
                                numHealthPotions--;// drink health potion

                                int damageTakenHeal = rand.nextInt(enemyAttackDamage);
                                health -= damageTakenHeal;
                                System.out.println("\t > You have been damaged for " + damageTakenHeal + " while not payung attention to the combat!");

                                if (health < 1) { //hero death
                                    System.out.println("\t> You have taken too much damage, what an irony you are too weak to go on! "); //hero death message
                                    break OUTER; //hero death
                                } //hero death


                                System.out.println("\t> You drank a health potion, healing youself for " + healthPotionHealAmmount + "."// drink health potion
                                        + "\n\t> You have " + health + " HP. "// drink health potion
                                        + "\n\t> You have " + numHealthPotions + "health potions left.\n");// drink health potion
                            } else {// drink health potion
                                System.out.println("\t> You have no health potions left in your inventory!Defeat enemies for a chance to find some! ");// drink health potion

                            }   break; // drink health potion
                        // drink health potion

                        // drink mana potion
                        case "5": // drink mana potion
                            if (numManaPotions > 0) {// drink mana potion
                                mana += manaPotionManaAmmount;// drink mana potion
                                numManaPotions--;// drink mana potion

                                int damageTakenHeal = rand.nextInt(enemyAttackDamage);
                                health -= damageTakenHeal;
                                System.out.println("\t > You have been damaged for " + damageTakenHeal + " while not payung attention to the combat!");

                                if (health < 1) { //hero death
                                    System.out.println("\t> You have taken too much damage, you are too weak to go on! "); //hero death message
                                    break OUTER; //hero death
                                } //hero death


                                System.out.println("\t> You drank a mana potion, restoring your mana for " + manaPotionManaAmmount + "."// drink mana potion
                                        + "\n\t> You have " + mana + " Mana. "// drink mana potion
                                        + "\n\t> You have " + numManaPotions + "mana potions left.\n");// drink mana potion
                            } else {// drink mana potion
                                System.out.println("\t> You have no mana  potions left in your inventory!Defeat enemies for a chance to find some! ");// drink mana potion
                            }   break;// drink mana potion
                        // drink mana potion


                        // drink stamina potion
                        case "6":   // drink stamina potion
                            if (numStaminaPotions > 0) {   // drink stamina potion
                                stamina += staminaPotionStaminaAmmount;   // drink stamina potion
                                numStaminaPotions--;   // drink stamina potion

                                int damageTakenHeal = rand.nextInt(enemyAttackDamage);
                                health -= damageTakenHeal;
                                System.out.println("\t > You have been damaged for " + damageTakenHeal + " while not payung attention to the combat!");

                                if (health < 1) { //hero death
                                    System.out.println("\t> You have taken too much damage, you are too weak to go on! "); //hero death message
                                    break OUTER; //hero death
                                } //hero death


                                System.out.println("\t> You drank a stamina potion, restoring your stamina for " + staminaPotionStaminaAmmount + "."   // drink stamina potion
                                        + "\n\t> You have " + stamina + "stamina. "   // drink stamina potion
                                        + "\n\t> You have " + numStaminaPotions + "stamina potions left.\n");   // drink stamina potion
                            } else {   // drink stamina potion
                                System.out.println("\t> You have no stamina  potions left in your inventory!Defeat enemies for a chance to find some! ");   // drink stamina potion
                            }   break;   // drink stamina potion
                        // drink stamina potion


                        // checks inventory
                        case "7":  // checks inventory

                            int damageTakenHeal = rand.nextInt(enemyAttackDamage);
                            health -= damageTakenHeal;
                            System.out.println("\t > You have been damaged for " + damageTakenHeal + " while not payung attention to the combat!");



                            if (health < 1) { //hero death
                                System.out.println("\t> You have taken too much damage, you are too weak to go on! "); //hero death message
                                break OUTER; //hero death
                            } //hero death


                            if (numStaminaPotions > 0) {// checks inventory
                                System.out.println("\t>  You have " + numStaminaPotions + " Stamina potions left in your inventory ! ");     // checks inventory
                            } else {// checks inventory
                                System.out.println("\t> You have no stamina potions left in your inventory!Defeat enemies for a chance to find some! ");// checks inventory
                            }  // break ;// checks inventory
                            if (numManaPotions > 0) {// checks inventory
                                System.out.println("\t>  You have " + numManaPotions + " Mana potions left in your inventory ! ");      // checks inventory
                            } else {// checks inventory
                                System.out.println("\t> You have no Mana potions left in your inventory!Defeat enemies for a chance to find some! ");// checks inventory
                            }  // break ;// checks inventory
                            if (numHealthPotions > 0) {//check helath potions in inventory
                                System.out.println("\t>  You have " + numHealthPotions + " Health potion left in your inventory ! ");            // checks inventory
                            } else {// checks inventory
                                System.out.println("\t> You have no Health potions left in your inventory!Defeat enemies for a chance to find some! ");// checks inventory
                            }   break ;// checks inventory
                        // checks inventory


                        //raun away
                        case "8": //raun away
                            System.out.println("\t> You have ran away form " + enemy + "!"); //raun away
                            int damageTaken2 = rand.nextInt(enemyAttackDamage) ; //raun away
                            health -= damageTaken2; //raun away
                            System.out.println("\t> You have taken" + damageTaken2  +" damage but you managed to run away form " + enemy + "!"); //raun away
                            if (stamina > 16  ) { //raun away
                                stamina -= 15; //raun away
                            }else{ //raun away
                                System.out.println("\t> You are too tired to run away!");            //raun away
                            } //raun away

                            if (health < 1) {// if died durring running away
                                System.out.println("\t> You have taken too much damage, you are too weak to go on! ");// if died durring running away
                                break OUTER;// if died durring running away
                            } // if died durring running away
                            continue OUTER_1;
                        default:
                            System.out.println("\t> Invalid command please chose 1 , 2 , 3 , 4 , 5 , 6 ,7 or 8 ");
                            break;
                    }
                }
                if (health < 1) { // end game
                    System.out.println("\t> You escape from the dungeon, you are too weak for battle!"); // end game
                    System.out.println("########################"); // end game
                    System.out.println("# Thanks for playing ! #"); // end game
                    System.out.println("########################"); // end game
                    break; // end game
                } // end game


                enemyDefeatedCounter ++;// enemy defeated counter May trigger boss fight ?

                System.out.println("-----------------------------------------------");
                System.out.println(" # " + enemy + " was defeated ! # ");
                System.out.println(" # " + enemyDefeatedCounter + " Number of enemies defeated ! # ");
                System.out.println(" # You have " + health + " HP left. #");
                System.out.println(" # You have " + stamina + " stamina left. #");
                System.out.println(" # You have " + mana + " Mana left. #");

                System.out.println(" # You " + name + " have " + heroSouls + " Soul(s) ! # ");
                System.out.println(" # You " + name + " have " +  heroGoldInInventory + " Gold ! # ");

                if (rand.nextInt(100) < healthPotionDropChance) {
                    numHealthPotions++;
                    System.out.println(" # The " + enemy + " had an unused health potion in their inventory now it is yours ! #");
                    System.out.println(" # You now have " + numHealthPotions + " health Potion(s). # ");
                }
                if (rand.nextInt(100) < ManaPotionDropChance) {
                    numManaPotions++;
                    System.out.println(" # The " + enemy + " had an unused mana potion in their inventory now it is yours ! #");
                    System.out.println(" # You now have " + numManaPotions + " mana Potion(s). # ");
                }
                if (rand.nextInt(100) < staminaPotionDropChance) {
                    numStaminaPotions++;
                    System.out.println(" # The " + enemy + " had an unused stamina potion in their inventory now it is yours ! #");
                    System.out.println(" # You now have " + numStaminaPotions + " Stamina Potion(s). # ");
                }
                if (rand.nextInt(100) < enemyExpDropChance) { //exp drop
                    heroExp ++;
                    heroExp += rand.nextInt(10);

                    if (heroExp <= 3.0) {
                        level=1;
                        health += 5;
                        stamina += 10;
                        mana += 5;
                    }else if (heroExp <= 6.0){
                        level=2;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 12.0){ // 7 - 12 xp lv 3
                        level=3;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 18.0){ // 13-18 lv 4
                        level=4;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 22.0){ // 13-18 lv 4
                        level=5;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 28.0){ // 13-18 lv 4
                        level=6;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 35.0){ // 13-18 lv 4
                        level=7;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 45.0){ // 13-18 lv 4
                        level=8;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 55.0){ // 13-18 lv 4
                        level=9;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 69.0){ // 13-18 lv 4
                        level=10;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 80.0){ // 13-18 lv 4
                        level=11;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 90.0){ // 13-18 lv 4
                        level=12;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 100.0){ // 13-18 lv 4
                        level=13;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 120.0){ // 13-18 lv 4
                        level=14;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 150.0){ // 13-18 lv 4
                        level=15;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 180.0){ // 13-18 lv 4
                        level=16;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 200.0){ // 13-18 lv 4
                        level=17;
                        health += 15;
                        stamina += 25;
                        mana += 30;
                    }else if (heroExp <= 235.0){ // 13-18 lv 4
                        level=18;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 292.0){ // 13-18 lv 4
                        level=19;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 350.0){ // 13-18 lv 4
                        level=20;
                    }else if (heroExp <= 390.0){ // 13-18 lv 4
                        level=21;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 400.0){ // 13-18 lv 4
                        level=22;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 500.0){ // 13-18 lv 4
                        level=23;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 600.0){ // 13-18 lv 4
                        level=24;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 700.0){ // 13-18 lv 4
                        level=25;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 850.0){ // 13-18 lv 4
                        level=26;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 900.0){ // 13-18 lv 4
                        level=27;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1000.0){ // 13-18 lv 4
                        level=28;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1100.0){ // 13-18 lv 4
                        level=29;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1500.0){ // 13-18 lv 4
                        level=30;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1600.0){ // 13-18 lv 4
                        level=31;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1700.0){ // 13-18 lv 4
                        level=32;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1800.0){ // 13-18 lv 4
                        level=33;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 1900.0){ // 13-18 lv 4
                        level=34;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 2000.0){ // 13-18 lv 4
                        level=35;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 2100.0){ // 13-18 lv 4
                        level=36;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 2200.0){ // 13-18 lv 4
                        level=37;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 2300.0){ // 13-18 lv 4
                        level=38;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 2400.0){ // 13-18 lv 4
                        level=39;
                        health += 150;
                        stamina += 250;
                        mana += 300;
                    }else if (heroExp <= 2500.0){ // 13-18 lv 4
                        level=40;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 2900.0){ // 13-18 lv 4
                        level=41;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3000.0){ // 13-18 lv 4
                        level=42;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3100.0){ // 13-18 lv 4
                        level=43;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3200.0){ // 13-18 lv 4
                        level=44;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3300.0){ // 13-18 lv 4
                        level=45;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3400.0){ // 13-18 lv 4
                        level=46;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3500.0){ // 13-18 lv 4
                        level=47;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3600.0){ // 13-18 lv 4
                        level=48;
                        health += 500;
                        stamina += 600;
                        mana += 800;
                    }else if (heroExp <= 3800.0){ // 13-18 lv 4
                        level=49;
                        health += 1500;
                        stamina += 1500;
                        mana += 1500;
                    }else{
                        System.out.println("You have reached the maximum level "+name);
                        System.out.println("Now " + name + " is level : "+level);
                        level=50;
                        health += 2000;
                        stamina += 2000;
                        mana += 2000;
                    }
                    System.out.println(" # You " + name + " have " + heroExp + " Xp pints! # ");

                    System.out.println(" # Now " + name + " is level : " + level + " # ");
                }
                if (rand.nextInt(100) < ennemyDropSoulChance) { //exp drop
                    heroSouls ++;
                    System.out.println(" # You " + name + " have  " + heroSouls + " Souls ! # ");
                }
                if (rand.nextInt(100) < ennemyGoldDropChance) { //exp drop
                    int goldPlusOnKill = 1;
                    goldPlusOnKill =+ rand.nextInt(100);
                    heroGoldInInventory += goldPlusOnKill;
                    System.out.println(" # You " + name + " have found " +  goldPlusOnKill + " Gold ! # ");


                    System.out.println("-----------------------------------------------");
                    System.out.println(" What would you like to do now ? ");
                    System.out.println("1. Continue fighting ");
                    System.out.println("2. Exit dungeon ");
                    System.out.println("3. Drink Health potion ");
                    System.out.println("4. Drink Mana potion ");
                    System.out.println("5. Drink Stamina potion ");
                    System.out.println("6. Check my inventory . ");
                    //  System.out.println("7. Show avaliable spells. ");
                    //  System.out.println("8. Show debufs. ");

                    String input = in.nextLine();// input from keyboard 1 2 3 4 5 6 option ?

                    while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4")&& !input.equals("5")&& !input.equals("6")) {
                        System.out.println(" Invalid command ! ");
                        input = in.nextLine();
                    }
                    switch (input) { // continue adventure
                        case "1":
                            System.out.println(" You have continued you adventure ");
                            break;
                        case "2": // escaped the dungeon alive
                            System.out.println(" You have exited the dungeon alive ! ");
                            break OUTER_1;
                        case "3": // drink heal potion
                            if (numHealthPotions > 0) {
                                health += healthPotionHealAmmount;
                                numHealthPotions--;
                                System.out.println("\t> You drank a health potion, healing youself for " + healthPotionHealAmmount + "."
                                        + "\n\t> You have " + health + " HP. "
                                        + "\n\t> You have " + numHealthPotions + "health potions left.\n");
                            } else {
                                System.out.println("\t> You have no health potions left in your inventory!Defeat enemies for a chance to find some! ");
                            }   break ;
                        case "4": // drink mana potion
                            if (numManaPotions > 0) {
                                mana += manaPotionManaAmmount;
                                numManaPotions--;
                                System.out.println("\t> You drank a mana potion, restoring your mana for " + manaPotionManaAmmount + "."
                                        + "\n\t> You have " + mana + " Mana. "
                                        + "\n\t> You have " + numManaPotions + "mana potions left.\n");
                            } else {
                                System.out.println("\t> You have no mana  potions left in your inventory!Defeat enemies for a chance to find some! ");
                            }   break  ;
                        case "5": // drink stamina potion
                            if (numStaminaPotions > 0) {
                                stamina += staminaPotionStaminaAmmount;
                                numStaminaPotions--;
                                System.out.println("\t> You drank a stamina potion rising stamina for  " + staminaPotionStaminaAmmount + "."
                                        + "\n\t> You have " + stamina + " stamina. "
                                        + "\n\t> You have " + numStaminaPotions + "stamina potions left.\n");
                            } else {
                                System.out.println("\t> You have no stamina potions left in your inventory!Defeat enemies for a chance to find some! ");
                            }   break ;

                        case "6": //check inventorty
                            if (numStaminaPotions > 0) {// check stamina potions in inventory
                                System.out.println("\t>  You have " + numStaminaPotions + " Stamina potions left in your inventory ! ");
                            } else {
                                System.out.println("\t> You have no stamina potions left in your inventory!Defeat enemies for a chance to find some! ");
                            }  // break ;
                            if (numManaPotions > 0) {//check mana potions in inventory
                                System.out.println("\t>  You have " + numManaPotions + " Mana potions left in your inventory ! ");
                            } else {
                                System.out.println("\t> You have no Mana potions left in your inventory!Defeat enemies for a chance to find some! ");
                            }  // break ;
                            if (numHealthPotions > 0) {//check helath potions in inventory
                                System.out.println("\t>  You have " + numHealthPotions + " Health potion left in your inventory ! ");
                            } else {
                                System.out.println("\t> You have no Health potions left in your inventory!Defeat enemies for a chance to find some! ");
                            }  //break ;

                        case "7":  // checks inventory

                            if (numStaminaPotions > 0) {// checks inventory
                                System.out.println("\t>  You have " + numStaminaPotions + " Stamina potions left in your inventory ! ");     // checks inventory
                            } else {// checks inventory
                                System.out.println("\t> You have no stamina potions left in your inventory!Defeat enemies for a chance to find some! ");// checks inventory
                            }  // break ;// checks inventory
                            if (numManaPotions > 0) {// checks inventory
                                System.out.println("\t>  You have " + numManaPotions + " Mana potions left in your inventory ! ");      // checks inventory
                            } else {// checks inventory
                                System.out.println("\t> You have no Mana potions left in your inventory!Defeat enemies for a chance to find some! ");// checks inventory
                            }  // break ;// checks inventory
                            if (numHealthPotions > 0) {//check helath potions in inventory
                                System.out.println("\t>  You have " + numHealthPotions + " Health potion left in your inventory ! ");            // checks inventory
                            } else {// checks inventory
                                System.out.println("\t> You have no Health potions left in your inventory!Defeat enemies for a chance to find some! ");// checks inventory
                            }   break ;// checks inventory
                        // checks inventory

                        default:
                            break;
                    }

                }


            }


        }// levelingsystem







}
