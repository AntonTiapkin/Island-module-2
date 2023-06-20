package com.javarush.island.tyapkin.Fauna.Herbivores;

import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Sheep extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.sheepMaxOnCell;

    public Sheep() {
        super(1, 7, 5);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}