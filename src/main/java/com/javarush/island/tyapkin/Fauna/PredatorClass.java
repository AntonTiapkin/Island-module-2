package com.javarush.island.tyapkin.Fauna;

import com.javarush.island.tyapkin.App.Settings;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


public class PredatorClass extends Animal implements Predator {

    public PredatorClass(int speed, double satiety, int starvingTime) {
        super(speed, satiety, starvingTime);
    }

    @Override
    public void eat(List<?> listOfFood, List<?> listOfFood1) {
        try {
            //Получаем число, на основании которого выберем жертву охоты
            int eatChance = ThreadLocalRandom.current().nextInt(0, 100);
            Map<String, Integer> mapOfChanceHunt = null;
            List<String> listOfHunts = null;
            String animalToEat;
            int listOfHuntsId;

            if (this.getStarvingTime() == 0) {
                //На основании класса животного - выберем конкретную мапу с шансами
                switch (this.getClass().getSimpleName()) {
                    case "Wolf":
                        mapOfChanceHunt = Settings.wolfMap;
                        break;
                    case "Snake":
                        mapOfChanceHunt = Settings.snakeMap;
                        break;
                    case "Fox":
                        mapOfChanceHunt = Settings.foxMap;
                        break;
                    case "Bear":
                        mapOfChanceHunt = Settings.bearMap;
                        break;
                    case "Eagle":
                        mapOfChanceHunt = Settings.eagleMap;
                        break;
                }

                //Из мапы выберем всех животных которые подходят под шанс охоты
                if (mapOfChanceHunt != null) {
                    listOfHunts = mapOfChanceHunt.entrySet().stream()
                            .filter(entry -> eatChance <= entry.getValue())
                            .map(Map.Entry::getKey)
                            .collect(Collectors.toList());

                }

                if (listOfHunts != null && listOfHunts.size() > 0) {
                    //в случайном порядке выбираем кого съедят
                    listOfHuntsId = ThreadLocalRandom.current().nextInt(0, listOfHunts.size());
                    animalToEat = listOfHunts.get(listOfHuntsId);
                    //Далее ищем в списке Травоядных совпадение по имени класса
                    //Если не нашли - ищем в списке Хищников
                    for (Object herbivore : listOfFood) {
                        Animal herbivore1 = (Animal) herbivore;
                        if (animalToEat.equals(herbivore1.getClass().getSimpleName())) {
                            listOfFood.remove(herbivore);
                        } else {
                            for (Object predator : listOfFood1) {
                                Animal predator1 = (Animal) predator;
                                if (animalToEat.equals(predator1.getClass().getSimpleName())) {
                                    listOfFood1.remove(predator);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
