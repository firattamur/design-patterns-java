package org.firattamur.creational.singleton;

public class GameSettings {

    public static GameSettings INSTANCE = null;

    private int difficulty = 1;
    private boolean isSoundOn = true;

    private GameSettings() {

    }

    public static GameSettings getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new GameSettings();
        }

        return INSTANCE;

    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isSoundOn() {
        return isSoundOn;
    }

    public void setSoundOn(boolean isSoundOn) {
        this.isSoundOn = isSoundOn;
    }

}
