package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    public void run() {
        String[] names = InputView.readCarNames();
        int tryCount = InputView.readTryCount();

        Cars cars = new Cars(names);
        OutputView.printExecutionMessage();

        for(int i = 0; i < tryCount; i++) {
            cars.moveAll();
            OutputView.printRoundResult(cars);
        }

        OutputView.printWinner(cars.getWinners());
    }
}
