package Models.Entitys.Helpers.InitializeEntity;

import Models.Entitys.Enemies.Monsters.Adventurer;
import Models.Entitys.Heroes.Hero;

public class InitializeEntity {

    public void initializeEnemyMonsterAdventurer (){

        //Adventurer adventurer = new Adventurer();

    }

    public void initializeHero (String name,int classHero,int race){

        Hero hero = new Hero(name,classHero,race,0,100,100,100,1,
                10,0,1,1,1,1,1,5,
        1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,0,false);

    }

}
