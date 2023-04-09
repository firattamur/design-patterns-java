package org.firattamur.creational.singleton;

public class GameSettingsEagerInit {

    private static final GameSettingsEagerInit INSTANCE = new GameSettingsEagerInit();

    private GameSettingsEagerInit() {
    }

    public static GameSettingsEagerInit getInstance() {
        return INSTANCE;
    }

}
