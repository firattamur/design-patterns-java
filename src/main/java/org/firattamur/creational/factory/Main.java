package org.firattamur.creational.factory;

import org.firattamur.creational.factory.gameobjects.Jewel;
import org.firattamur.creational.factory.gameobjects.JewelType;

public class Main {

    public static void main(String[] args) {

        JewelFactory factory = new JewelFactory();

        Jewel ruby = factory.createJewel(JewelType.RUBY);
        Jewel diamond = factory.createJewel(JewelType.DIAMOND);

        System.out.println(ruby.crush());
        System.out.println(diamond.crush());

    }

}
