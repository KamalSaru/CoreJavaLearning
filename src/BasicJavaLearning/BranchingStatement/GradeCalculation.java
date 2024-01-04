package BasicJavaLearning.BranchingStatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00"); //decimal format
        Scanner scanner=new Scanner(System.in);
        String [] subjects={"Math", "English", "Nepali", "Science", "Computer"}; //Array list

        System.out.println("**************************************************");
        System.out.println("The total number of subject is : "+subjects.length);//total number of subject
        short totalSubjectFullMark=5*100; //Each subject full mark is 100

        System.out.println("First subject is :- "+subjects[0]);  //Array list index start from 0
        System.out.print("Enter the the marks obtained : ");
        float mark0= scanner.nextFloat();

        System.out.println("Second subject is :- "+subjects[1]);
        System.out.print("Enter the mark obtained : ");
        float mark1=scanner.nextFloat();

        System.out.println("Third subject is :- "+subjects[2]);
        System.out.print("Enter the the marks obtained : ");
        float mark2= scanner.nextFloat();

        System.out.println("Fourth subject is :- "+subjects[3]);
        System.out.print("Enter the the marks obtained : ");
        float mark3= scanner.nextFloat();

        System.out.println("Fifth subject is :- "+subjects[4]);
        System.out.print("Enter the the marks you obtained : ");
        float mark4= scanner.nextFloat();

        float totalMark= mark0+mark1+mark2+mark3+mark4;  //sum of the marks
        float averagePercentage = (totalMark/totalSubjectFullMark)*100;  //Average percentage formula
        System.out.println("The total percent mark you get : "+df.format(averagePercentage)+"%");//df is decimal format in 0.00
        if(averagePercentage>=90) {
            System.out.println("Congratulation !!! your grade is A.");
        } else if( averagePercentage>=80) {
            System.out.println("Congratulation !!! your grade is B.");
        } else if (averagePercentage>=70) {
            System.out.println("Satisfying !!! your grade is C.");
        } else if (averagePercentage>=60) {
            System.out.println("You need work hard !!! your grade is D.");
        } else {
            System.out.println("Sorry !!! you failed.");
        }
        System.out.println("Thank You!!!");
    }
}
