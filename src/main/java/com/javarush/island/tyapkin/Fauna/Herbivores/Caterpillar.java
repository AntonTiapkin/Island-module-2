package com.javarush.island.tyapkin.Fauna.Herbivores;

import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Caterpillar extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.caterpillarMaxOnCell;

    public Caterpillar() {
        super(1, 0.0025, 2);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}