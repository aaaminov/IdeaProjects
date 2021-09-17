package com.company;

public abstract class Plant {
    public abstract String getData();
}
class Tree extends Plant {
    String howUsed;

    public Tree(String howUsed) {
        this.howUsed = howUsed;
    }
    @Override
    public String getData() {
        return "Как используется: " + howUsed + "\n";
    }
}

class Bush extends Plant {
    String typeOfFruit;

    public Bush(String typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
    }
    @Override
    public String getData() {
        return "Тип плода: " + typeOfFruit + "\n";
    }
}

class Flower extends Plant {
    int lifeExpectancy;
    boolean hasSmell;

    public Flower(int lifeExpectancy, boolean hasSmell) {
        this.lifeExpectancy = lifeExpectancy;
        this.hasSmell = hasSmell;
    }
    @Override
    public String getData() {
        return "Продолжительность жизни = " + Integer.toString(lifeExpectancy) +
                ", имеет ли запах: " + Boolean.toString(hasSmell);
    }
}
