package org.firattamur.structural.adapter;

public class Main {

    public static void main(String[] args) {

            OldGem oldGem = new OldGem();
            Movable movable = new GemAdapter(oldGem);
            movable.move(10, 20);

    }

}
