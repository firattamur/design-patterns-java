package org.firattamur.creational.factory;

import org.firattamur.creational.factory.gameobjects.Diamond;
import org.firattamur.creational.factory.gameobjects.Jewel;
import org.firattamur.creational.factory.gameobjects.JewelType;
import org.firattamur.creational.factory.gameobjects.Ruby;


/**
 * Factory class for creating jewels.
 */
public class JewelFactory {

    /**
     * Creates a jewel based on the given type.
     *
     * @param type the type of the jewel
     * @return the created jewel
     */
    public Jewel createJewel(JewelType type) {
        return switch (type) {
            case DIAMOND    -> new Diamond(type);
            case RUBY       -> new Ruby(type);
            default         -> throw new IllegalArgumentException("Unknown jewel type: " + type);
        };
    }

}
