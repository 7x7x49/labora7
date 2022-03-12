package com.company;

public class Main {

    public static class Animal{
        Animal animal;
        public String Name;
        private String food;
        public String location;
        public String setFood(){
            return food;
        }

        Animal(String Name,String food,String location){
            this.Name = Name;
            this.food=food;
            this.location=location;
        }
        public void eat(){
            System.out.println("*больше всего предпочитает* \n ест ");
        }
        public void makeNoise(){
            System.out.println("звучит");
        }
        public void sleep(){
            System.out.println("устал");
        }
        public void displayInfo(){
            System.out.println("Место приёма: " + location);
            System.out.println("Корм: " + food);
        }

    }

    static class Dog extends Animal{
        private String nuance = "не доверяет";

        Dog(String Name,String food,String location) {
            super(food, location, Name);
        }

        @Override
        public void eat() {
            System.out.println("▸болонка хочет, чтобы на следующий приём пищи была " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("▸болонка тяфкает");
        }

        @Override
        public void sleep() {
            System.out.println("▸болонка уединилась");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println(" ☒ Недостаток: " + nuance);
        }
    }
    static class Horse extends Animal{
        private String nuance = "странно смотрит";
        Horse(String Name,String food,String location) {
            super(food, location, Name);
        }
        @Override
        public void eat() {
            System.out.println("▸пони жуёт " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("▸пони цокает");
        }

        @Override
        public void sleep() {
            System.out.println("▸пони устала");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println(" ☒ Недостаток: " + nuance);
        }
    }
    static class Cat extends Animal{
        private String dignity = "чудесные подушечки";
        Cat(String Name,String food,String location) {
            super(food, location, Name);
        }

        @Override
        public void eat() {
            System.out.println("▸котёнок больше предпочитает " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("▸котёнок играется с рукой");
        }

        @Override
        public void sleep() {
            System.out.println("▸котёнок прилёг на диван");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println(" ☑ Достоинство: " + dignity);
        }
    }
    static class Veterinarian{
        void treatAnimal(Animal animal) {
            System.out.println("корм: " + animal.food);
            System.out.println("место: " + animal.location);
            System.out.println( "▫ " + animal.Name + " сейчас находится у ветеринара ▫");
        }
    }
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Санкт-Петербург", "Канна", "курица");
        animals[1] = new Cat("Казань","Берта", "лосось");
        animals[2] = new Horse("Севастополь","Сиби", "яблоко");
        for (int i = 0; i <= animals.length - 1; i++) {
            vet.treatAnimal(animals[i]);
            animals[i].displayInfo();
            System.out.println("\n");
        }
    }
}