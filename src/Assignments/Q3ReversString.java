package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//This program to reverse a string***********************************************
public class Q3ReversString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String reversWord="";
        System.out.print("Please enter the words you want revers :- ");
        String originalWord= scanner.nextLine();
        for (int i=0; i<originalWord.length(); i++){
            reversWord=originalWord.charAt(i) +reversWord;
        }
        //Example result  Kathmandu=udnamhtaK
        System.out.println("Reverse word is :- "+reversWord);
    }
}
