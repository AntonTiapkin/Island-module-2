package Fauna;

import App.Settings;

public class Herb {
    private double weigh;
    private static int maxOnCell = Settings.herbsMaxOnCell;

    public Herb() {
        this.weigh = 1;
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

}
