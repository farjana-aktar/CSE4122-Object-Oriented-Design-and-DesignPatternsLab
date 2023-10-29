package com.Farjana;

abstract class Animal {
    String animalName;

    Animal(String name){

        setAnimalName(name);
    }
    void setAnimalName(String name){

        this.animalName = name;
    }
    void eat(){

        System.out.println("can eat");
    }
    void sleep(){

        System.out.println("can sleep");
    }
    abstract void sound();
    void summary(){
        eat();
        sleep();
        sound();
        System.out.println("\n\n");
    }

}

class LandAnimal extends Animal {
    public LandAnimal(String name) {

        super(name);
    }

    void move(){

        System.out.println("can move");
    }

    @Override
    void sound() {

        System.out.println("can roar!!!");
    }

    @Override
    void summary() {
        System.out.println(animalName);
        move();
        super.summary();
    }
}


class WaterAnimal extends Animal {
    public WaterAnimal(String name) {

        super(name);
    }

    void swim(){

        System.out.println("can swim");
    }

    @Override
    void sound() {

        System.out.println("cannot make sound :(");
    }

    @Override
    void summary() {
        System.out.println(animalName);
        swim();
        super.summary();

    }
}

class FlyingAnimal extends Animal {
    public FlyingAnimal(String name) {

        super(name);
    }

    void fly(){

        System.out.println("can fly");
    }

    @Override
    void sound() {

        System.out.println("can whisper!!!");
    }

    @Override
    void summary() {
        System.out.println(animalName);
        fly();
        super.summary();
    }
}

class Main{
    public static void main(String[] args) {
        LandAnimal landAnimal = new LandAnimal("Tiger");
        landAnimal.summary();

        WaterAnimal waterAnimal = new WaterAnimal("Dolphin");
        waterAnimal.summary();

        FlyingAnimal flyingAnimal = new FlyingAnimal("Bird");
        flyingAnimal.summary();
    }
}
