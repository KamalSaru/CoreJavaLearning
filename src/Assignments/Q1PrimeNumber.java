package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to check the prime numbers********************************************************
//A prime number is a whole number greater than 1 whose only factors are 1 and itself
public class Q1PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the prime number :- ");
        int primeNumber=scanner.nextInt();
        if(isPrimeNumber(primeNumber)) {
            System.out.println("You enter the number "+ primeNumber+" is prime number.");
        }
        else{
            System.out.println("You enter the number "+ primeNumber + " is not prime number.");
        }
    }
    static boolean isPrimeNumber(int number) // check the prime number
    {
        if(number<=1)
        {
            return false;
        }
        for(int i=2;i<=number/2;i++)
        {
            if((number%i)==0)
                return  false;
        }
        return true;
    }

}
