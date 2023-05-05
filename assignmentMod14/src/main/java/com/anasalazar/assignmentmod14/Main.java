/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anasalazar.assignmentmod14;

/**
 *
 * @author anasa
 */
public class Main {
    public static void main(String[] args) {
        
        //test 1 - when n has primer numbers with digit 5 
        int n = 100;
        int sum = sumPrimeAndDigit5(n);
        System.out.println("Sum of prime numbers with digit 5 from 0 to " + 
                            n + " is: " + sum);
        
        //test 2 - when n is 0
        int n2 = 0;
        int sum2 = sumPrimeAndDigit5(n2);
        System.out.println("Sum of prime numbers with digit 5 from 0 to " + 
                            n2 + " is: " + sum2);
        
        //test 3 - when n is negative 
        int n3 = -10;
        int sum3 = sumPrimeAndDigit5(n2);
        System.out.println("Sum of prime numbers with digit 5 from 0 to " + 
                            n3 + " is: " + sum3);
        
        //test 4 - when there a no prime number between 0 and n
        int n4 = 30;
        int sum4 = sumPrimeAndDigit5(n3);
        System.out.println("Sum of prime numbers with digit 5 from 0 to " + 
                            n4 + " is: " + sum4);
        
        
    }
    //check if number is prime
    public static boolean isPrime(int number){
            if (number <= 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
    }
    //check if a number has the digit 5
    public static boolean hasDigit5(int number){
        while (number > 0){
            if (number % 10 == 5){
                return true;
            }
            number /= 10;
        }
        return false;
    }
    //calculate the sum on the prime numbers with digit 5
    public static int sumPrimeAndDigit5(int n){
        int sum = 0;
        for (int i = 2; i <= n; i++){
            if (isPrime(i) && hasDigit5(i)){
                sum += i;
            }
        }
        return sum;
    }
}
