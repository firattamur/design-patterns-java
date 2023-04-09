package org.firattamur.creational.singleton;

public class GameSettingsSynchronized {

    private static GameSettingsSynchronized INSTANCE = null;

    private GameSettingsSynchronized() {

    }

    public static synchronized GameSettingsSynchronized getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new GameSettingsSynchronized();
        }

        return INSTANCE;

    }

}
