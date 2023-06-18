package com.javarush.island.tyapkin.Fauna.Predators;

import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Predator;
import com.javarush.island.tyapkin.Fauna.PredatorClass;

public class Wolf extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.wolfMaxOnCell;

    public Wolf() {
        super(50, 3, 8, 10);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}