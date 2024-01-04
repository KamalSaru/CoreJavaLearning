package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;
import java.util.*;

//Program to check if a given number is a palindrome****************************
public class Q18CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the number to check palindrome :- ");
        int inputNumber=scanner.nextInt();

        int originalNumber=inputNumber;
        int reversNumber =0;
        while (inputNumber !=0) {
            int remainder = inputNumber % 10; //getting remainder
            reversNumber = reversNumber * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        if (originalNumber == reversNumber) {
            System.out.println("The user input " + originalNumber +" number is palindrome.");
        } else {
            System.out.println("The user input "+originalNumber +" number is not palindrome.");
        }
    }
}
