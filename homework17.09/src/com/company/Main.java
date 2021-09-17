package com.company;

public class Main {

    public static void main(String[] args) {
        Plant tree = new Tree("дуб", "России","для бумаги");
        Plant brush = new Bush("яблоня", "России", "яблоко");
        Plant flower = new Flower("Мак","России", 10, true);
        System.out.print( tree.getData() + brush.getData() + flower.getData());
    }
}
