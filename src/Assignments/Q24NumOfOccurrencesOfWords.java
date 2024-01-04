package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//program to find the number of occurrences of a word in a sentence********************
public class Q24NumOfOccurrencesOfWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the word to count occurrence :- ");
        String inputWords= scanner.nextLine();

        Map<String, Integer> stringCount=new HashMap<>();
        String[] stringWords =inputWords.split(" ");// Splitting the words of string and storing them in the array
        for (String words : stringWords) {    // Asking whether the stringCount contains the key or not. Will return null if not
            Integer integer=stringCount.get(words);
            if (integer==null)
                stringCount.put(words,1);
            else {
                stringCount.put(words, integer+1);
            }
        }
        System.out.println("The words occurrences is :- "+stringCount+" times.");
    }
}
