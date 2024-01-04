package JavaMethod;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        float[] marks = new float[3];
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter mark of the first subject : ");
        marks[0] = sc.nextFloat();
        checkIfStudentIsPassed(marks[0]);

        System.out.println("Enter mark of the first subject : ");
        marks[1] = sc.nextFloat();
        checkIfStudentIsPassed(marks[1]);

        System.out.println("Enter mark of the first subject : ");
        marks[2] = sc.nextFloat();
        checkIfStudentIsPassed(marks[2]);
    }
    public static void checkIfStudentIsPassed(float obtainedMark) {
        if(obtainedMark<32) {
            System.err.println("you failed in this subject.");
        } else {
            System.out.println("You pass in this subject.");
        }
    }
}
