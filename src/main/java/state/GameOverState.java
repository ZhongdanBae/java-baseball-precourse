package state;

import model.BaseballNumber;
import model.Game;
import model.NumberGenerator;
import view.Inputview;
import view.OutputView;

public class GameOverState implements GameState{
    private final Inputview inputview = new Inputview();
    private final OutputView outputView = new OutputView();

    @Override
    public void handle(Game game){
        outputView.printRestartGuide();
        String input = inputview.readRestart();
        changeState(input, game);
    }

    private void changeState(String input, Game game){
        if("1".equals(input)) {
            restart(game);
            return;
        }
        if("2".equals(input)) {
            game.changeState(new EndState());
            return;
        }
        outputView.printError("1 또는 2를 입력해야 합니다.");
    }

    private void restart(Game game){
        NumberGenerator numberGenerator = new NumberGenerator();
        BaseballNumber baseballNumber = numberGenerator.generate();
        game.changeState(new ProgressState(baseballNumber));
    }
}
