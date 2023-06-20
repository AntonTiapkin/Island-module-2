package com.javarush.island.tyapkin.App;


import com.javarush.island.tyapkin.Island.Cell;

import static com.javarush.island.tyapkin.App.ConstantVoid.*;

public class PrintStatictic implements Runnable {

    private int iterPrintStatic;
    private final Cell[][] objects;

    public PrintStatictic(Cell[][] objects) {
        this.objects = objects;
    }

    @Override
    public void run() {
        System.out.println(ITERATION + this.iterPrintStatic + PRINTING_STATISTICS);
        addHerbs(objects);
        printStat(objects);
        this.iterPrintStatic++;
    }

    public static void printStat(Cell[][] objects) {
        try {
            for (int i = 0; i < objects.length; i++) {
                for (int j = 0; j < objects[i].length; j++) {
                    System.out.print(CELL + i + "x" + j);
                    System.out.println(PLANT + objects[i][j].countHerbs()
                            + PREDATORS + objects[i][j].countPredators()
                            + HERBIVORES + objects[i][j].countHerbivores() + "\n"
                            + objects[i][j].countEachPredator() + "\n"
                            + objects[i][j].countEachHerbivore());
                }
            }
            System.out.println(INDENT);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addHerbs(Cell[][] objects) {
        try {
            for (Cell[] object : objects) {
                for (Cell cell : object) {
                    cell.addHerb();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
