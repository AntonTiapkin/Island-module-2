package com.javarush.island.tyapkin.Fauna.Herbivores;


import com.javarush.island.tyapkin.Settings;
import com.javarush.island.tyapkin.Fauna.Animal;
import com.javarush.island.tyapkin.Fauna.Herbivor;
import com.javarush.island.tyapkin.Fauna.HerbivoreClass;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Hamster extends HerbivoreClass implements Herbivor {

    private static int maxOnCell = Settings.hamsterMaxOnCell;

    public Hamster() {
        super(0.03, 1, 0.0075, 3);
    }

    public static int getMaxOnCell() {
        return maxOnCell;
    }

    @Override
    public void eat(List<?> listOfFood, List<?> listOfFood1) {
        try {
            if (this.getSatiety() < this.getMaxSatiety()) {
                int eatChance = ThreadLocalRandom.current().nextInt(0, 100);
                if (eatChance > 10) {
                    double diff = this.getMaxSatiety() - this.getSatiety();
                    if (listOfFood.size() > diff) {
                        this.setSatiety(this.getMaxSatiety());
                        this.setStarvingTime(this.getMaxStarvingTime());
                        listOfFood.subList(0, (int) diff).clear();
                    }
                } else {
                    for (Object predator : listOfFood1) {
                        Animal predator1 = (Animal) predator;
                        if (predator1.getClass().getSimpleName().equals("Caterpillar")) {
                            listOfFood1.remove(predator);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}