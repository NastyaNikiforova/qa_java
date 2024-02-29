package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatCheckSoundTest {

    @Test
    public void getSoundReturnMeow() {
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}