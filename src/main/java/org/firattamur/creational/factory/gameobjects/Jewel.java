package org.firattamur.creational.factory.gameobjects;


/**
 * Simple Jewel abstract class for the game.
 *
 */
public abstract class Jewel {

    private final JewelType type;

    public Jewel(JewelType type) {
        this.type = type;
    }

    public String crush() {
        return "Crushed Jewel: " + type.toString();
    }

}
