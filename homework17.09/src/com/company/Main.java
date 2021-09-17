package com.company;

public class Main {

    public static void main(String[] args) {
        Plant tree = new Tree("для бумаги");
        Plant brush = new Bush("вишня");
        Plant flower = new Flower(10, true);
        System.out.print( tree.GetData() + brush.GetData() + flower.GetData());
    }
}
