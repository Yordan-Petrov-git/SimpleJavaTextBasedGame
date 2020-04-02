package Models.Entitys.Helpers.InitializeEntity;

import Controller.Controller;
import Models.Entitys.Enemies.Monsters.Adventurer;
import Models.Entitys.Heroes.Hero;

import java.util.stream.Collectors;

public class InitializeEntity extends Controller {

    public void initializeEnemyMonsterAdventurer(String nameEnemy, int classEnemy, int raceEnemy) {

        Adventurer adventurer = new Adventurer(nameEnemy, classEnemy, raceEnemy, 0, 100, 100, 100, 1,
                10, 0, 1, 1, 1, 1, 1, 5,
                1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 0, false
                , 1, 1, 0);



    }

    public static void initializeHero(String nameHero, int classHero, int raceHero) {

        Hero hero = new Hero(nameHero, classHero, raceHero, 0, 100, 100, 100, 1,
                10, 0, 1, 1, 1, 1, 1, 5,
                1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 0, false);


    }

}
