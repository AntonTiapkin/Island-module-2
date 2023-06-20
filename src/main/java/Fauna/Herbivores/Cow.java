package Fauna.Herbivores;

import com.javarush.island.tyapkin.App.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Cow extends HerbivoreClass implements Herbivor {

    private static final int maxOnCell = Settings.cowMaxOnCell;

    public Cow() {
        super(1, 53, 4);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}