package org.firattamur.structural.adapter;

public class GemAdapter implements  Movable {

    private final OldGem oldGem;

    public GemAdapter(OldGem oldGem) {
        this.oldGem = oldGem;
    }

    @Override
    public void move(int x, int y) {
        oldGem.moveTo(new int[]{x, y});
    }

}
