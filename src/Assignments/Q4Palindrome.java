package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to check if a string is a palindrome********************************
//a word, phrase, or sequence that reads the same backward as forward exm. civic, 1991
public class Q4Palindrome {
    public static void main(String[] args) {
        String reversPalindromeWord="";
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the word to check palindrome :- ");
        String word= scanner.nextLine();
        for (int i=0; i<word.length(); i++){
            reversPalindromeWord = word.charAt(i) + reversPalindromeWord;
        }
        if(reversPalindromeWord.equals(word)){
            System.out.println("The user input word is Palindrome.");
        } else {
            System.out.println("The user input word is not Palindrome.");
        }
    }
}
