package com.javarush.island.tyapkin.Fauna.Predators;

import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Predator;
import com.javarush.island.tyapkin.Fauna.PredatorClass;

public class Fox extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.foxMaxOnCell;

    public Fox() {
        super(4, 3, 1, 8);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}