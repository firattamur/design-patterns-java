package org.firattamur.structural.bridge.gameboard;

import org.firattamur.structural.bridge.renderer.Renderer;

public class HexagonalGameBoard extends GameBoard {

    public HexagonalGameBoard(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        renderer.renderGameBoard(this);
    }

}
