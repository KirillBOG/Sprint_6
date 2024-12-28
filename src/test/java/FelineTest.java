package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline = new Feline();

    @Test
    public void getFamilyTest() {
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutParams() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParamsInt() {
        feline.getKittens(0);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
    }
    @Test
    public void eatMeatTest() throws Exception {

        List<String> actualFood = feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
        Assert.assertNotNull(actualFood);
    }
}