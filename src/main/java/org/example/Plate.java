package org.example;

    public class Plate {
        private int food;
        public Plate(){
            this(0);
        }
        public Plate(int food) {
            this.food = food;
        }

        public void setFood(int food){
            if (food < 0 ){
                this.food = 0;
            }
            else {
                this.food = food;
            }
        }

        public void addFood(int food){
            this.food = this.food + food;
            if (this.food + food < 0){
                this.food = this.food + food;
            }
        }

        public int getFood() {
            return food;
        }

        public void info() {
            System.out.println("plate: " + food);
        }
    }