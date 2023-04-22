package org.firattamur.structural.bridge.gameboard;

import org.firattamur.structural.bridge.renderer.Renderer;

public class RectangularGameBoard extends GameBoard {

    public RectangularGameBoard(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        renderer.renderGameBoard(this);
    }

}
