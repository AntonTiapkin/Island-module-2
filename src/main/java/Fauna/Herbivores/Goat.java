package Fauna.Herbivores;


import com.javarush.island.tyapkin.App.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Goat extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.goatMaxOnCell;

    public Goat() {
        super(1, 10, 5);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}