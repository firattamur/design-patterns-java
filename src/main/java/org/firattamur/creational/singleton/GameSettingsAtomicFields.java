package org.firattamur.creational.singleton;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class GameSettingsAtomicFields {

    private static GameSettingsAtomicFields INSTANCE = null;

    private AtomicInteger difficulty = new AtomicInteger(1);
    private AtomicBoolean isSoundOn = new AtomicBoolean(true);

    private GameSettingsAtomicFields() {

    }

    public static GameSettingsAtomicFields getInstance() {

        if (INSTANCE == null) {
            synchronized (GameSettingsAtomicFields.class) {
                if (INSTANCE == null) {
                    INSTANCE = new GameSettingsAtomicFields();
                }
            }
        }

        return INSTANCE;

    }

    public int getDifficulty() {
        return difficulty.get();
    }

    public void setDifficulty(int difficulty) {
        this.difficulty.set(difficulty);
    }

    public boolean isSoundOn() {
        return isSoundOn.get();
    }

    public void setSoundOn(boolean isSoundOn) {
        this.isSoundOn.set(isSoundOn);
    }

}
