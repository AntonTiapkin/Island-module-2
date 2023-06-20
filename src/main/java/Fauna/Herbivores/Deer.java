package Fauna.Herbivores;


import com.javarush.island.tyapkin.App.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Deer extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.deerMaxOnCell;

    public Deer() {
        super(3, 26, 4);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}