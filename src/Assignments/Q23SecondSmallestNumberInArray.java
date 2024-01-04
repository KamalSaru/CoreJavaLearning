package Assignments;
////Name :- Kamal Saru, Baltimore Maryland, DiyoTech

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//program to find the second-smallest element in an array.********************************
public class Q23SecondSmallestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> arrayNumberList=new ArrayList<>();
        System.out.print("please enter the total number of array list :- ");
        int totalArrayNumberList= scanner.nextInt();

        for(int i=0; i<totalArrayNumberList; i++) {
            System.out.print("Enter the number in the list :- ");
            int listOfNumber = scanner.nextInt();
            arrayNumberList.add(listOfNumber);
        }

        arrayNumberList=arrayNumberList.stream().sorted().collect(Collectors.toList());
        System.out.println("Second smallest number in the array list is:- "+arrayNumberList.get(1));
    }
}
