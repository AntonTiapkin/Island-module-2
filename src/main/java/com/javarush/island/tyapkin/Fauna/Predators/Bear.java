package com.javarush.island.tyapkin.Fauna.Predators;

import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.Fauna.Predator;
import com.javarush.island.tyapkin.Fauna.PredatorClass;

public class Bear extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.bearMaxOnCell;

    public Bear() {
        super(2, 38, 15);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}