package org.firattamur.creational.prototype.gameobjects;

import org.firattamur.creational.prototype.Prototype;

public class BlueGem extends GameObject {

    public BlueGem(int x, int y, String color) {
        super(x, y, color);
    }

    public BlueGem(BlueGem blueGem) {
        super(blueGem);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a blue gem at (" + x + ", " + y + ") with color " + color);
    }

    @Override
    public Prototype clone(boolean isShallow) {

        if (isShallow) {
            return this;
        } else {
            return new BlueGem(this);
        }

    }

}
