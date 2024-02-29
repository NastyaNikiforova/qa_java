package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionExceptionTest {

    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("male", new Feline());
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}