package com.company;

public class Main {

    public static void main(String[] args) {
        Plant tree = new Tree("для бумаги");
        Plant brush = new Bush("яблоко");
        Plant flower = new Flower(10, true);
        System.out.print( tree.getData() + brush.getData() + flower.getData());
    }
}
