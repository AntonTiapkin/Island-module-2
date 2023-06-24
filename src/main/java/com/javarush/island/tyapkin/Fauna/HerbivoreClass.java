package com.javarush.island.tyapkin.Fauna;



import java.util.List;


public class HerbivoreClass extends Animal implements Herbivor {

    public HerbivoreClass(int speed, double satiety, int starvingTime) {
        super(speed, satiety, starvingTime);
    }

    @Override
    public void eat(List<?> listOfFood, List<?> listOfFood1) {
        if (this.getSatiety() < this.getMaxSatiety()) {
            double diff = this.getMaxSatiety() - this.getSatiety();
            if (listOfFood.size() > diff) {
                this.setSatiety(this.getMaxSatiety());
                this.setStarvingTime(this.getMaxStarvingTime());
                listOfFood.subList(0, (int) diff).clear();
            }
        }
    }

}
