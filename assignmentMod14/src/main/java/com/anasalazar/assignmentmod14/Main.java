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
        
        int number = 100;
        int sum = sumPrimeAndDigit5(number);
        System.out.println("Sum of prime numbers with digit 5 from 0 to " + 
                            number + " is: " + sum);
        
        
    }
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
    public static boolean hasDigit5(int number){
        while (number > 0){
            if (number % 10 == 5){
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static int sumPrimeAndDigit5(int n){
        int sum = 0;
        for (int i = 2; i <= n; i++){
            if (isPrime(i) && hasDigit5(i)){
                sum +=i;
            }
        }
        return sum;
    }
}
