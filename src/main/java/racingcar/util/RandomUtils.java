package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtils {
    private RandomUtils() {}

    public static int generateNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
