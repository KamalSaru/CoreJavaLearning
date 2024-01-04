package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.Scanner;

//program to check if a number is positive, negative, or zero***********************************
public class Q22CheckNumPNZ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any inter number to check :- ");
        int number=scanner.nextInt();
        if(number>0)
            System.out.println("The number "+number+" is Positive Number.");
        else if(number<0)
            System.out.println("The number "+number+" is Negative Number.");
        else
            System.out.println("The number "+number+" is Zero.");
    }
}
