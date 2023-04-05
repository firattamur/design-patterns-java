package org.firattamur.creational.prototype.gameobjects;

import org.firattamur.creational.prototype.Prototype;

public abstract class GameObject extends Prototype {

    protected int x;
    protected int y;
    protected String color;

    public GameObject(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public GameObject(GameObject gameObject) {
        this.x = gameObject.x;
        this.y = gameObject.y;
        this.color = gameObject.color;
    }

    public abstract void draw();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
