package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;

//Program to print the first N prime numbers***************************************
//A prime number is a whole number greater than 1 whose only factors are 1 and itself
//A factor is a whole number that can be divided evenly into another number
public class Q20firstNPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the requested prime number size :- ");
        int primeNumberSize= scanner.nextInt();
        int count =0;
        for (int number=2; count<primeNumberSize; number++){
            boolean isPrime=true;
            for (int i=2; i<=number/2; i++) {
                if ( number % i==0 ){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true){
                System.out.println("The first N prime numbers are :- "+number+" ");
                count++;
            }
        }
    }
}
