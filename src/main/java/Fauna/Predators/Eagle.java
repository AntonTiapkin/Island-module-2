package Fauna.Predators;

import com.javarush.island.tyapkin.App.Settings;
import Fauna.Predator;
import Fauna.PredatorClass;

public class Eagle extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.eagleMaxOnCell;

    public Eagle() {
        super(4, 1, 6);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}
