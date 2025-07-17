package com.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest 
{
    @ParameterizedTest 
    @CsvFileSource(resources = "./data/jdd.csv", numLinesToSkip = 1)
    @Tag("soustraction")
    @Tag("atypique")
    public void test1(int a, int b, int r)
    {
        soustraction_positive sp=new soustraction_positive();
        int resultat=sp.sp(a, b);
        assertEquals(r, resultat);
    }

    @Test
    @Tag("soustraction")
    @Tag("typique")
    public void test2()
    {
        soustraction_positive sp=new soustraction_positive();
        int resultat=sp.diff(3, 7);
        assertEquals(-4, resultat);
    }

    @Test
    public void test3()
    {
        soustraction_positive sp=new soustraction_positive();
        int resultat=sp.diff(3, 7);
        assertEquals(-5, resultat);
    }
}
