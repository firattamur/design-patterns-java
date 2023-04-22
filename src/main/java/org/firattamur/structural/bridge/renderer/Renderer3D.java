package org.firattamur.structural.bridge.renderer;

import org.firattamur.structural.bridge.gameboard.GameBoard;

public class Renderer3D implements Renderer {

    @Override
    public void renderGameBoard(GameBoard gameBoard) {
        System.out.println("Rendering the game board in 3D with for " + gameBoard.getClass().getSimpleName());
    }

}
