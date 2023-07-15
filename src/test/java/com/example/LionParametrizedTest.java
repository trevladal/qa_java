package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private String lionSex;
    private boolean hasMane;

    public LionParametrizedTest(String lionSex, boolean hasMane) {
        this.lionSex = lionSex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] checkText() {

        return new Object[][]{
                {"Самец", true}, {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(lionSex);
        assertEquals(hasMane, lion.doesHaveMane());

    }
}