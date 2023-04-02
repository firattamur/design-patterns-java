package org.firattamur.creational.abstractfactory.factory;

import org.firattamur.creational.abstractfactory.gameobjects.enemy.Enemy;
import org.firattamur.creational.abstractfactory.gameobjects.enemy.SnakeEnemy;
import org.firattamur.creational.abstractfactory.gameobjects.weapon.StoneWeapon;
import org.firattamur.creational.abstractfactory.gameobjects.weapon.Weapon;

/**
 * Level 1 game object factory class for the game.
 *
 */
public class Level1GameObjectFactory extends LevelGameObjectFactory {

    public Enemy createEnemy() {
        return new SnakeEnemy();
    }

    public Weapon createWeapon() {
        return new StoneWeapon();
    }

}
