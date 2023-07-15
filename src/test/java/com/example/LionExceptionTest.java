package com.example;

import org.junit.Test;


public class LionExceptionTest {

    @Test(expected = Exception.class)
    public void doesHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion("Апельсинчик");
    }
}
