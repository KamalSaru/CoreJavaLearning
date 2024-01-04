package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.SocketHandler;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to count the number of occurrences of a character in a string***********
public class Q6CountOccurrenceOfChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the character to count occurrence :- ");
        String words= scanner.nextLine();

        Map<Character, Integer> characterCount=new HashMap<>();
        for (Character character: words.toCharArray()){
            if (characterCount.containsKey(character)){
                characterCount.put(character, characterCount.get(character)+1);
            }else {
                characterCount.put(character, 1);
            }
        }
        for (Map.Entry entry:characterCount.entrySet()){
            System.out.println("The occurrence of " +entry.getKey() +" :- " + entry.getValue()+" times.");
        }
    }
}
