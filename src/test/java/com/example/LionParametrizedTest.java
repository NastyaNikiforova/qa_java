package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest { // параметризация - "самка", "самец", "не определен" + кол-во котят?
    private String sex;
    private boolean hasMane;

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParam() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane() {
        try {
            Lion lion = new Lion(sex, new Feline());
            assertEquals(hasMane, lion.doesHaveMane());
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }

//    @Test
//    public void getKittens() {
//    }
//
//    @Test
//    public void getFood() {
//    }
}