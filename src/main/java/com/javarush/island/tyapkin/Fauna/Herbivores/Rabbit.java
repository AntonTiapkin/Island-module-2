package com.javarush.island.tyapkin.Fauna.Herbivores;

import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Rabbit extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.rabbitMaxOnCell;

    public Rabbit() {
        super(3, 0.45, 7);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}