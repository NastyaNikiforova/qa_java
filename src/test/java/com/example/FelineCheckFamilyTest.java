package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineCheckFamilyTest {


    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}