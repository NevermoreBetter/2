package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);
        Circle c3 = new Circle(4);
        Circle c4 = new Circle(6);
        Circle c5 = new Circle(5);
        c1.toString();
        Hash h=new Hash(10);
        h.insert(c3);
        h.insert2(c2);
        h.insert2(c4);
        h.insert2(c1);
        h.insert2(c5);
        h.print();

    }
}
