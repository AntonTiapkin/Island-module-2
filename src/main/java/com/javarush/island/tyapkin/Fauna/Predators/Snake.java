package com.javarush.island.tyapkin.Fauna.Predators;

import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.Fauna.Predator;
import com.javarush.island.tyapkin.Fauna.PredatorClass;

public class Snake extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.snakeMaxOnCell;

    public Snake() {
        super(1, 0.3, 15);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}