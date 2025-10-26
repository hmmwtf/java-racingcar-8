package racingcar.model;

import racingcar.util.RandomUtils;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank() || name.length() > 5) {
            throw new IllegalArgumentException("Invalid car name");
        }
    }

    public void move() {
        if (RandomUtils.generateNumber() >= 4) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}
