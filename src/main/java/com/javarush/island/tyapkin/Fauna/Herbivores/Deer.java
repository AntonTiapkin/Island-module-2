package com.javarush.island.tyapkin.Fauna.Herbivores;


import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Deer extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.deerMaxOnCell;

    public Deer() {
        super(170, 3, 26, 4);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}