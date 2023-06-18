package com.javarush.island.tyapkin.Fauna.Predators;

import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Predator;
import com.javarush.island.tyapkin.Fauna.PredatorClass;

public class Eagle extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.eagleMaxOnCell;

    public Eagle() {
        super(6, 4, 1, 6);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}
