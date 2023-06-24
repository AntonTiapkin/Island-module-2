package com.javarush.island.tyapkin.Fauna;

import com.javarush.island.tyapkin.App.MovementDirection;


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Animal {
    private final int speed;
    private final double maxSatiety;
    private double satiety;
    private final int maxStarvingTime;
    private int starvingTime;
    private int gender;

    public Animal(int speed, double satiety, int starvingTime) {
        this.speed = speed;
        this.maxSatiety = satiety;
        this.satiety = satiety;
        this.maxStarvingTime = starvingTime;
        this.starvingTime = starvingTime;
        setGender();
    }

    //что бы можно было выбрать рацион
    public abstract void eat(List<?> listOfFood, List<?> listOfFood1);

    public MovementDirection setDirection() {
        MovementDirection movementDirection;

        int moveDirection = ThreadLocalRandom.current().nextInt(0, 4);

        if (moveDirection == MovementDirection.UP.ordinal()) {
            movementDirection = MovementDirection.UP;
        } else if (moveDirection == MovementDirection.RIGHT.ordinal()) {
            movementDirection = MovementDirection.RIGHT;
        } else if (moveDirection == MovementDirection.DOWN.ordinal()) {
            movementDirection = MovementDirection.DOWN;
        } else if (moveDirection == MovementDirection.LEFT.ordinal()) {
            movementDirection = MovementDirection.LEFT;
        } else {
            movementDirection = null;
        }

        return movementDirection;
    }

    private void setGender() {
        this.gender = (int) (Math.random() * 2 + 1);
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

    public void setStarvingTime(int starvingTime) {
        this.starvingTime = starvingTime;
    }

    public int getGender() {
        return this.gender;
    }

    public double getSatiety() {
        return satiety;
    }

    public int getStarvingTime() {
        return starvingTime;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public int getMaxStarvingTime() {
        return maxStarvingTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void decreaseSatiety() {
        if (this.satiety <= 0) {
            this.starvingTime--;
        } else {
            int rand = 1 + (int) (Math.random() * ((this.maxSatiety - 1)));
            this.satiety = this.satiety - rand;
        }
    }

    public boolean reproduction() {
        return this.satiety == this.maxSatiety;
    }
}

