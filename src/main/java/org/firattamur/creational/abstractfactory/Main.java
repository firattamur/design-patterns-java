package org.firattamur.creational.abstractfactory;

import org.firattamur.creational.abstractfactory.factory.Level1GameObjectFactory;
import org.firattamur.creational.abstractfactory.factory.Level2GameObjectFactory;
import org.firattamur.creational.abstractfactory.factory.LevelGameObjectFactory;
import org.firattamur.creational.abstractfactory.gameobjects.enemy.Enemy;
import org.firattamur.creational.abstractfactory.gameobjects.weapon.Weapon;

public class Main {

    public static void main(String[] args) {

        // Level 1 - Game Objects
        LevelGameObjectFactory level1GameObjectFactory = new Level1GameObjectFactory();
        Enemy level1Enemy = level1GameObjectFactory.createEnemy();
        Weapon level1Weapon = level1GameObjectFactory.createWeapon();

        System.out.println("Level 1 Enemy: " + level1Enemy.getClass().getSimpleName());
        System.out.println("Level 1 Weapon: " + level1Weapon.getClass().getSimpleName());

        // Level 2 - Game Objects
        LevelGameObjectFactory level2GameObjectFactory = new Level2GameObjectFactory();
        Enemy level2Enemy = level2GameObjectFactory.createEnemy();
        Weapon level2Weapon = level2GameObjectFactory.createWeapon();

        System.out.println("Level 2 Enemy: " + level2Enemy.getClass().getSimpleName());
        System.out.println("Level 2 Weapon: " + level2Weapon.getClass().getSimpleName());

    }

}
