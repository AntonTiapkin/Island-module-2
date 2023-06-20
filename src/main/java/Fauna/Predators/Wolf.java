package Fauna.Predators;

import com.javarush.island.tyapkin.App.Settings;
import Fauna.Predator;
import Fauna.PredatorClass;

public class Wolf extends PredatorClass implements Predator {

    private static int maxOnCell = Settings.wolfMaxOnCell;

    public Wolf() {
        super(3, 8, 10);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }
}