package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void getFoodForCat() {
        try {
            Feline feline = Mockito.mock(Feline.class);
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Cat cat = new Cat(feline);
            List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expectedFood, cat.getFood());
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}