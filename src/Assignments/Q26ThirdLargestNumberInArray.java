package Assignments;
//Name :- Kamal Saru, Baltimore Maryland, Di-yo-Tech

import java.util.*;
import java.util.stream.Collectors;

//program to find the third-largest element in an array****************************
public class Q26ThirdLargestNumberInArray {
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

        arrayNumberList=arrayNumberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Third largest number in the array list is:- "+arrayNumberList.get(2));
    }
}
