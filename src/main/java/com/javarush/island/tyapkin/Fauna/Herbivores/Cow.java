package com.javarush.island.tyapkin.Fauna.Herbivores;

import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Cow extends HerbivoreClass implements Herbivor {

    private static final int maxOnCell = Settings.cowMaxOnCell;

    public Cow() {
        super(1, 53, 4);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}