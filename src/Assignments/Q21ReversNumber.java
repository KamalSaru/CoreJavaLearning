package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;

//Program to reverse a number*******************************************
public class Q21ReversNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number you want revers :- ");
        int inputNumber=scanner.nextInt();
        int reversNumber = 0;

        while (inputNumber !=0){
            reversNumber=reversNumber*10;
            reversNumber=reversNumber+inputNumber%10;
            inputNumber=inputNumber/10;
        }
        System.out.println("Revers number of the user input number is :- "+reversNumber);
    }
}
