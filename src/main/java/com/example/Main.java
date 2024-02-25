package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Cat cat = new Cat(feline);
        Animal animal = new Animal();
    }
}

