package Assignments;

import java.util.Arrays;
import java.util.Scanner;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to find the maximum occurring character in a string*******************************
public class Q13MaximumCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System. in);
        System.out.print("Enter string to find the maximum character :- ");
        String inputString = in.nextLine();

        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        String character = new String(tempArray);
        int number = character.length();
        int maxcharCount = 0;
        int charCount = 1;
        char maxCharacter = '-';
        for (int i = 1; i <= number; i++)
        {
            if ((i == number) || (character.charAt(i) != character.charAt(i - 1)))
            {
                if (maxcharCount < charCount)
                {
                    maxcharCount = charCount;
                    maxCharacter = character.charAt(i-1);
                }
                charCount = 1;
            }
            else
            {
                charCount++;
            }
        }
        System.out.println("Maximum occurring character is :- " +maxCharacter);
    }
}
