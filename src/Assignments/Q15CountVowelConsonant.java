package Assignments;

import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to count the number of vowels and consonants in a string.*****************************************************
public class Q15CountVowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string words :- ");
        String stringWords= scanner.nextLine();

        int countVowel=0;
        int countConsonant=0;
        stringWords=stringWords.toLowerCase();
        //vowel letters- a,e,i,o,u
        for (int i=0; i<stringWords.length(); i++){
            if (stringWords.charAt(i)=='a'|| stringWords.charAt(i)=='e' || stringWords.charAt(i)==i
            || stringWords.charAt(i)=='o' || stringWords.charAt(i)=='u')
                countVowel++; //increment each time
            else if (stringWords.charAt(i) >='a' && stringWords.charAt(i) <='z')
                countConsonant++;//Increment of consonants
            }
        System.out.println("The total number of letter in string is :- "+stringWords.length());
        System.out.println("The total number of vowel letter is :- "+countVowel);
        System.out.println("The total number of consonant letter is :- "+countConsonant);
    }
}
