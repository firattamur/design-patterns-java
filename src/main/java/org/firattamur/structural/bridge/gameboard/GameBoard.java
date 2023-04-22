package org.firattamur.structural.bridge.gameboard;

import org.firattamur.structural.bridge.renderer.Renderer;

public abstract class GameBoard {

    protected Renderer renderer;

    public GameBoard(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void render();

}
