package Fauna.Herbivores;

import com.javarush.island.tyapkin.Settings;
import Fauna.Herbivor;
import Fauna.HerbivoreClass;

public class Cow extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.cowMaxOnCell;

    public Cow() {
        super(350, 1, 53, 4);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}