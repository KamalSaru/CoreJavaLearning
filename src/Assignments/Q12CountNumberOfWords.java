package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to count the number of words in a string********************************
public class Q12CountNumberOfWords {
    public static void main(String[] args) {
        int wordsCount= 1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence :- ");
        String words= scanner.nextLine();
        for (int i=1; i<words.length(); i++){
            if (words.charAt(i)==' ' && Character.isLetter(words.charAt(i+1)) && (i>0)){
               wordsCount++;
            }
        }
        System.out.println("The total number of words in sentences are :- "+wordsCount);
    }

}
