package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;

//Program to find the sum of digits in a given number*****************************
public class Q25SumOfDigitInNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number you want sum:- ");
        long number=scanner.nextLong();
        long sum=0;

        //executes until the condition number!=0 becomes false
        for (sum=0; number!=0; number=number/10) {
            //finds the last digit and add it to the variable sum
            sum = sum + number % 10;
        }

        System.out.println("Sum of the given number is :- " + sum);
    }
}
