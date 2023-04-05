package org.firattamur.creational.prototype;

import org.firattamur.creational.prototype.gameobjects.BlueGem;

public class Main {

    public static void main(String[] args) {

        BlueGem blueGem = new BlueGem(10, 20, "blue");
        BlueGem blueGemShallow = (BlueGem) blueGem.clone(true);
        BlueGem blueGemDeep = (BlueGem) blueGem.clone(false);

        System.out.println("Drawing original blue gem...");
        blueGem.draw();

        System.out.println("Moving original blue gem to (30, 40)...");
        blueGem.setX(30);
        blueGem.setY(40);

        System.out.println("Drawing shallow cloned blue gem...");
        blueGemShallow.draw();

        System.out.println("Drawing deep cloned blue gem...");
        blueGemDeep.draw();

    }

}
