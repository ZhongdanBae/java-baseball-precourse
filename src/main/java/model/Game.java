package model;

import state.GameState;

public class Game {
    private GameState state;
    private boolean running = true;

    public Game(GameState initialState) {
        this.state = initialState;
    }

    public void changeState(GameState state) {
        this.state = state;
    }

    public void update() {
        state.handle(this);
    }

    public void stop() {
        this.running = false;
    }

    public boolean isRunning() {
        return running;
    }
}
