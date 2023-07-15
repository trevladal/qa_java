package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class LionGetFoodTest {

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
