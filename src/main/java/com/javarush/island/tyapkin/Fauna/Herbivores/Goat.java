package com.javarush.island.tyapkin.Fauna.Herbivores;


import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

public class Goat extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.goatMaxOnCell;

    public Goat() {
        super(65, 1, 10, 5);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}