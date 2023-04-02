package org.firattamur.creational.abstractfactory.factory;

import org.firattamur.creational.abstractfactory.gameobjects.enemy.Enemy;
import org.firattamur.creational.abstractfactory.gameobjects.weapon.Weapon;


/**
 * Abstract Factory Class for creating objects for levels.
 *
 */
public abstract class LevelGameObjectFactory {

    public abstract Enemy createEnemy();
    public abstract Weapon createWeapon();

}
