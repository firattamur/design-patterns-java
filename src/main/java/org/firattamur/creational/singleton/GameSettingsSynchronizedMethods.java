package org.firattamur.creational.singleton;

public class GameSettingsSynchronizedMethods {

    private static GameSettingsSynchronizedMethods INSTANCE = null;

    private int difficulty = 1;
    private boolean isSoundOn = true;

    private GameSettingsSynchronizedMethods() {

    }

    public static GameSettingsSynchronizedMethods getInstance() {

        if (INSTANCE == null) {
            synchronized (GameSettingsSynchronizedMethods.class) {
                if (INSTANCE == null) {
                    INSTANCE = new GameSettingsSynchronizedMethods();
                }
            }
        }

        return INSTANCE;

    }

    public int getDifficulty() {
        return difficulty;
    }

    public synchronized void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isSoundOn() {
        return isSoundOn;
    }

    public synchronized void setSoundOn(boolean isSoundOn) {
        this.isSoundOn = isSoundOn;
    }

}
