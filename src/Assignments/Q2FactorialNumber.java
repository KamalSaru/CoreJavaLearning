package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to calculating the factorial numbers**********************************************
public class Q2FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //int number=5;//It is the number calculate factorial
        int factorialNumber=1;
        System.out.print("Please enter the factorial number :- ");
        int factNumber=scanner.nextInt();
        for (int i=1; i<=factNumber; i++){
            factorialNumber=factorialNumber*i; // for example-factorialNumber=5*4*3*2*1=120
        }
        System.out.println("Factorial number of "+factNumber+" is "+factorialNumber+".");
    }
}
