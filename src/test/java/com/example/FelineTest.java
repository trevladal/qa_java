package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {

        feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());

    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        feline.getKittens(3);
        assertEquals(3, feline.getKittens(3));

    }

    @Test
    public void getKittensTestWithoutArgs() {
        feline.getKittens();
        assertEquals(1, feline.getKittens());
    }

}

