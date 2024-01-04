package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;

//Program to find the number of digits in a given number*************************************
public class Q17NumDigitInGivenNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the number to find digit :-  ");
        int enterNumber=scanner.nextInt();

        int digitCount=0;
        while (enterNumber!=0){
            enterNumber=enterNumber/10;
            digitCount++;
        }
        System.out.println("The total number of the digit in given number is :- "+digitCount);
    }
}
