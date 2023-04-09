package org.firattamur.creational.singleton;

public class GameSettingsDoubleCheckLock {

    private static volatile GameSettingsDoubleCheckLock INSTANCE;

    private GameSettingsDoubleCheckLock() {
    }

    public static GameSettingsDoubleCheckLock getInstance() {
        if (INSTANCE == null) {
            synchronized (GameSettingsDoubleCheckLock.class) {
                if (INSTANCE == null) {
                    INSTANCE = new GameSettingsDoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }

}
