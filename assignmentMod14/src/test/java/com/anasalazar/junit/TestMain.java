/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anasalazar.junit;

import com.anasalazar.assignmentmod14.Main;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author anasa
 */
public class TestMain {
    
    
    public void TestMain() {
       
    }
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    //test if n is prime
    @Test
    public void isPrimeTest(){
        int n = 2;
        boolean test = false;
        boolean test2 = Main.isPrime(n);
        assertEquals(test, test2);
    }
    //test if n has a digit 5
    @Test
    public void hasDigit5Test(){
        int n = 35;
        boolean test = false;
        boolean test2 = Main.hasDigit5(n);
        assertEquals(test, test2);
    }
    //test the sum of n is the same value as expected
    @Test
    public void sumPrimeAndDigit5Test(){
        int n = 100;
        int test = 117;
        int test2 = Main.sumPrimeAndDigit5(n);
        assertEquals(test, test2);
    }
   
}
