package org.example;

public class Main {

        public static void main(String[] args) {
            Cat cat1 = new Cat("Barsik", 11);
            Cat cat2 = new Cat("Rad", 15);
            Cat cat3 = new Cat("Maikl", 18);
            Cat cat4 = new Cat("Bublic", 12);
            Cat cat5 = new Cat("Mursic", 16);
            Cat cat6 = new Cat("Musya", 6);
            Cat cat7 = new Cat("Blacky", 15);
            Cat cat8 = new Cat("Karl", 17);

            Cat[] cats = new Cat[8];
            cats[0] = cat1;
            cats[1] = cat2;
            cats[2] = cat3;
            cats[3] = cat4;
            cats[4] = cat5;
            cats[5] = cat6;
            cats[6] = cat7;
            cats[7] = cat8;

            Plate plate = new Plate(100);
            for (Cat cat: cats) {
                cat.eat(plate);
                System.out.println(cat.info());
            }
            plate.info();
            plate.addFood(50);
            System.out.println("Добавили еды в тарелку");
            plate.info();
        }

    }
