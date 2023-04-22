package org.firattamur.structural.bridge;

import org.firattamur.structural.bridge.gameboard.GameBoard;
import org.firattamur.structural.bridge.gameboard.HexagonalGameBoard;
import org.firattamur.structural.bridge.gameboard.RectangularGameBoard;
import org.firattamur.structural.bridge.renderer.Renderer;
import org.firattamur.structural.bridge.renderer.Renderer2D;
import org.firattamur.structural.bridge.renderer.Renderer3D;

public class Main {

    public static void main(String[] args) {

        Renderer renderer2d = new Renderer2D();
        Renderer renderer3d = new Renderer3D();

        GameBoard rectangular2d = new RectangularGameBoard(renderer2d);
        GameBoard rectangular3d = new RectangularGameBoard(renderer3d);

        GameBoard hexagonal2d = new HexagonalGameBoard(renderer2d);
        GameBoard hexagonal3d = new HexagonalGameBoard(renderer3d);

        rectangular2d.render();
        rectangular3d.render();

        hexagonal2d.render();
        hexagonal3d.render();

    }

}
