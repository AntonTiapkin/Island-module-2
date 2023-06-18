package com.javarush.island.tyapkin.Fauna.Herbivores;

import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Horse extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.horseMaxOnCell;

    public Horse() {
        super(300, 3, 45, 5);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}