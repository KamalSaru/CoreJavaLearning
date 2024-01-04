package BasicJavaLearning.ForLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalculation1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00"); //decimal format
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"Math", "English", "Nepali", "Science", "Computer"};
        float[] marks = new float[5];
        short totalSubjectFullMark = 5 * 100;
        float totalMarks = 0;

        for (int j= 0; j <= marks.length; j++) {
            for (int i = 0; i <= subjects.length; i++) {
                System.out.print("The subject " + subjects[i] + " marks is :  ");
                marks[i] = scanner.nextFloat();
                System.out.println("The subject " + subjects[i] + " and mark is " + marks[j]);

                totalMarks += marks[j];
                float averagePercentage = (totalMarks/totalSubjectFullMark)*100;  //Average percentage formula
                System.out.println("Your percent grade is : " + df.format(averagePercentage) + "%");//df is decimal format in 0.00
                if (averagePercentage >= 90) {
                    System.out.println("Congratulation !!! your grade is A.");
                } else if (averagePercentage >= 80) {
                    System.out.println("Congratulation !!! your grade is B.");
                } else if (averagePercentage >= 70) {
                    System.out.println("Satisfying !!! your grade is C.");
                } else if (averagePercentage >= 60) {
                    System.out.println("You need work hard !!! your grade is D.");
                } else {
                    System.out.println("Sorry !!! you failed.");
                }
                System.out.println("Thank You!!!");

            }
        }
    }
}




