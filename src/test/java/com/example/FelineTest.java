package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    public Feline feline;

    @Test
    public void getKittensWithParamKittensCount() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void getKittensNoParamReturn1() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void eatMeatIfPredator() {
        try {
            feline.eatMeat();
            Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}