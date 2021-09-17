package com.company;

public abstract class Plant {
    String name;
    String habitat;

    public Plant(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public abstract String getData();
}
class Tree extends Plant {
    String howUsed;

    public Tree(String name, String habitat, String howUsed) {
        super(name, habitat);
        this.howUsed = howUsed;
    }
    @Override
    public String getData() {
        return name + " , растет в " + habitat +  ", как используется: " + howUsed + "\n";
    }
}

class Bush extends Plant {
    String typeOfFruit;

    public Bush(String name, String habitat, String typeOfFruit) {
        super(name, habitat);
        this.typeOfFruit = typeOfFruit;
    }

    @Override
    public String getData() {
        return name + " , растет в " + habitat +  ", тип плода: " + typeOfFruit + "\n";
    }
}

class Flower extends Plant {
    int lifeExpectancy;
    boolean hasSmell;

    public Flower(String name, String habitat, int lifeExpectancy, boolean hasSmell) {
        super(name, habitat);
        this.lifeExpectancy = lifeExpectancy;
        this.hasSmell = hasSmell;
    }

    @Override
    public String getData() {
        return name + " , растет в " + habitat +
                ", продолжительность жизни = " + Integer.toString(lifeExpectancy) +
                ", имеет ли запах: " + Boolean.toString(hasSmell);
    }
}
