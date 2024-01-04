package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to find the Fibonacci series up to a given number*******************************
//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers
//a set of integers (the Fibonacci numbers) that starts with a zero, followed by a one, then by another one, and then by a series of steadily increasing
public class Q7FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the total terms of the series :- ");
        int totalNumber= scanner.nextInt();
        System.out.println("Fibonacci series run until "+ totalNumber +" terms.");
        int firsTerm = 0, secondTerm=1;

        for (int i =0; i<totalNumber; i++){
            System.out.print(firsTerm +", "); //Rules The Rule is xn = xn−1 + xn−2

            //computer the next terms
            int nextTerm= firsTerm + secondTerm;
            firsTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
