package JavaClass.Constructor;

import java.util.Scanner;

public class StudentDetails {
    String name;
    byte grade;
    byte age;
    /*String section;
    short rollNumber;
    String phoneNumber, email, address;*/

    public StudentDetails(String name, byte grade, byte age){
        this.name=name;
        this.grade=grade;
        this.age=age;
        /*this.section=section;
        this.rollNumber=rollNumber;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address; */
    }

    public static void main(String[] args) {
        //StudentDetails student = new StudentDetails("Kamal", 5, 12);

       // Scanner sc = new Scanner(System.in);
        /*for (int i = 0; i < student.length; i++) {
        System.out.println("Enter the student name : ");
        String name = sc.nextLine();

        System.out.println("Enter the student grade : ");
        student.grade = sc.nextByte();

        System.out.print("Enter the age of student: ");
        student.age = sc.nextByte();
        sc.nextLine();  //for next line, sometime its consume so that.

        System.out.print("Enter section of student: ");
        student.section = sc.nextLine();

        System.out.print("Enter the student roll number: ");
        student.rollNumber = sc.nextShort();

        System.out.print("Enter student phone number: ");
        student.phoneNumber = sc.nextLine();
        sc.nextLine();  ////for next line, sometime its consume so that.

        System.out.print("Enter the student email: ");
        student.email = sc.nextLine();

        System.out.print("Enter student home address: ");
        student.address = sc.nextLine();
    } */

        /*System.out.println("\nStudent Details");
        System.out.println("  Name:- "+student.name);  //output next line \n
        System.out.println("  Grade:- " +student.grade);
        System.out.println("  Age:- " +student.age);
        System.out.println("  Section:- "+student.section);
        System.out.println("  Roll Number:- "+student.rollNumber);
        System.out.println("  Phone Number:- "+student.phoneNumber);
        System.out.println("  Email Address:- "+student.email);
        System.out.println("  Student Address:- "+student.address); */

    }
}
