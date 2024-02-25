package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensForLionReturn1() {
        try {
            Lion lion = new Lion("Самка", feline);
            lion.getKittens();
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFoodForLionPredator() {
        try {
            Lion lion = new Lion("Самец", feline);
            lion.getFood();
            Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}