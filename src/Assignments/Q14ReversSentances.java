package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Name :- Kamal Saru, Baltimore Maryland, DiyoTech

//Program to reverse the words in a sentence.************************************
public class Q14ReversSentances {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the sentence : - ");
        String inputWords= scanner.nextLine();

        String[] words=inputWords.split(" "); //split the words
        String outpuString = " ";
        for (int i=words.length-1; i>=0; i--){
            outpuString=outpuString + words[i] + " "; //Space between two words
        }
        System.out.println("Reverse word are :- "+outpuString);
    }
}
