package org.firattamur.creational.builder;

/**
 * Simple Match3 game class.
 */
public class Match3Game {

    private final int time;
    private final int level;
    private final int score;
    private final int boardWidth;
    private final int boardHeight;

    public Match3Game(int time, int level, int score, int boardWidth, int boardHeight) {
        this.time = time;
        this.level = level;
        this.score = score;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    @Override
    public String toString() {
        return "Match3Game{" +
                "time=" + time +
                ", level=" + level +
                ", score=" + score +
                ", boardWidth=" + boardWidth +
                ", boardHeight=" + boardHeight +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class for Match3Game.
     */
    public static class Builder {

        private int time;
        private int level;
        private int score;
        private int boardWidth;
        private int boardHeight;

        public Builder() {
            this.time = 10;
            this.level = 1;
            this.score = 0;
            this.boardWidth = 8;
            this.boardHeight = 8;
        }

        public Builder setTime(int time) {
            this.time = time;
            return this;
        }

        public Builder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Builder setScore(int score) {
            this.score = score;
            return this;
        }

        public Builder setBoardWidth(int boardWidth) {
            this.boardWidth = boardWidth;
            return this;
        }

        public Builder setBoardHeight(int boardHeight) {
            this.boardHeight = boardHeight;
            return this;
        }

        public Match3Game build() {
            return new Match3Game(this.time, this.level, this.score, this.boardWidth, this.boardHeight);
        }

    }

}
