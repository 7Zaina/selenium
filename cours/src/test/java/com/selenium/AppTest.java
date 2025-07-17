package com.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public void test1()
    {
        soustraction_positive sp=new soustraction_positive();
        int r=sp.sp(10, 7);
        assertEquals(3, r);
    }
}
