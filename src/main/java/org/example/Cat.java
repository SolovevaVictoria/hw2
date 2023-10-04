package org.example;

public class Cat {
        private String name;
        private int appetite;
        private boolean satiety;

        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
        }

        public int getAppetite() {
            return appetite;
        }

        public String info() {
            return String.format("Кот %s - %s; Аппетит: %d", name, this.satiety ? "сыт" : "голоден", appetite);
        }

        public void setAppetite(int appetite) {
            this.appetite = appetite;
        }

        public void eat(Plate plate) {
                if (!this.satiety) {
                    if (this.appetite <= plate.getFood()){
                        plate.setFood(plate.getFood() - this.getAppetite());
                        this.setAppetite(0);
                        this.satiety = true;
        }       }   }
}
