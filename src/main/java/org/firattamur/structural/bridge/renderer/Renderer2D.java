package org.firattamur.structural.bridge.renderer;

import org.firattamur.structural.bridge.gameboard.GameBoard;

public class Renderer2D implements Renderer {

    @Override
    public void renderGameBoard(GameBoard gameBoard) {
        System.out.printf("Rendering the game board in 2D with for %s%n", gameBoard.getClass().getSimpleName());
    }

}
