package bridge.domain;

import bridge.view.InputView;
import bridge.view.OutputView;

import java.util.List;

public class BridgeGame {
    private List<String> bridgeGame;
    private int tryCount;

    public BridgeGame(List<String> bridgeGame, int tryCount) {
        this.bridgeGame = bridgeGame;
        this.tryCount = tryCount;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void addTryCount() {
        tryCount ++;
    }

    public boolean move(String moveSide, int index) {
        return bridgeGame.get(index).equals(moveSide);
    }

    public boolean retry() {
        OutputView.printRetryMessage();
        String command = InputView.inputGameCommand();
        if (command.equals("R")) return true;
        if (command.equals("Q")) return false;
        throw new IllegalArgumentException("[ERROR] 'R' 또는 'Q'를 입력해 주세요.");
    }
}
