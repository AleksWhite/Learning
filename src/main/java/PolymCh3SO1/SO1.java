package PolymCh3SO1;

import java.util.ArrayList;

/*
Космическая одиссея ч.1
*/

public class SO1 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew() {
        //напишите тут ваш код
        Dog astronaut1 = new Dog();
        Cat astronaut2 = new Cat();
        Human astronaut3 = new Human();
        Human astronaut4 = new Human();
        astronauts.add(astronaut1);
        astronauts.add(astronaut2);
        astronauts.add(astronaut3);
        astronauts.add(astronaut4);

    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
