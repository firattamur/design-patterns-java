package org.firattamur.creational.builder;

public class Main {

    public static void main(String[] args) {

        Match3Game match3Game = Match3Game.builder()
                .setTime(20)
                .setLevel(2)
                .setScore(100)
                .setBoardWidth(10)
                .setBoardHeight(10)
                .build();

        System.out.println(match3Game);

    }

}
