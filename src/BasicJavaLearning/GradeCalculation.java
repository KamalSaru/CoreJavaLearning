package BasicJavaLearning.ForLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00"); //decimal format
        //int [][] subjectMarks = new int[5][5];
        String [] subjects={"Math", "English", "Nepali", "Science", "Computer"};
        float[] marks = { 78.25f, 98.75f, 75.25f, 85.25f, 72.25f};

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the subjects and marks : ");
        String subject=scanner.nextLine();
        float mark=scanner.nextFloat();

        for (int i = 0; i <subjects.length; i++) {
            System.out.println(subjects[i]);
            for (int j = 0; j < marks.length; j++) {
                System.out.println(marks[j]);

            }
        }
    }
}




