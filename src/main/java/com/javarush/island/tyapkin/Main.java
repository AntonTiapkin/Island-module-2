package com.javarush.island.tyapkin;


import com.javarush.island.tyapkin.App.PrintStatictic;
import com.javarush.island.tyapkin.App.Settings;
import com.javarush.island.tyapkin.App.SimulateLife;
import com.javarush.island.tyapkin.Island.Island;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //инициализируем класс с настройками, что бы сработал блок инициализации.
        Settings settings = new Settings();
        //Генерируем карту
        Island island = new Island();

        //Объект отвечающий за рост растений и статистику системы
        PrintStatictic prs = new PrintStatictic(island.getIsland());
        //Объект отвечающий за симуляцию жизни
        SimulateLife simLife = new SimulateLife(island.getIsland());
        //Шедулер потока статистики и роста
        ScheduledExecutorService sesStatictic = Executors.newScheduledThreadPool(1);
        //Шедулер потока симуляции
        ScheduledExecutorService sesSimulateLife = Executors.newScheduledThreadPool(10);
        //Переодически запускаем таски
        ScheduledFuture<?> sF = sesStatictic.scheduleAtFixedRate(prs, 0, 3, TimeUnit.SECONDS);
        ScheduledFuture<?> simulateLife = sesSimulateLife.
                scheduleAtFixedRate(simLife, 1, 1, TimeUnit.SECONDS);

        //некий вариант ограничения. Все должно иметь конец =)
        int iter = 0;
        while (true) {
            try {
                Thread.sleep(3000);
                iter++;
                if (iter > 1) {
                    System.out.println();
                    sF.cancel(true);
                    simulateLife.cancel(true);
                    sesStatictic.shutdown();
                    sesSimulateLife.shutdown();
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
