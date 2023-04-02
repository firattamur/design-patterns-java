package org.firattamur.creational.abstractfactory.factory;

import org.firattamur.creational.abstractfactory.gameobjects.enemy.BirdEnemy;
import org.firattamur.creational.abstractfactory.gameobjects.enemy.Enemy;
import org.firattamur.creational.abstractfactory.gameobjects.weapon.RifleWeapon;
import org.firattamur.creational.abstractfactory.gameobjects.weapon.Weapon;

/**
 * Level 2 game object factory class for the game.
 *
 */
public class Level2GameObjectFactory extends LevelGameObjectFactory {

    @Override
    public Weapon createWeapon() {
        return new RifleWeapon();
    }

    @Override
    public Enemy createEnemy() {
        return new BirdEnemy();
    }

}
