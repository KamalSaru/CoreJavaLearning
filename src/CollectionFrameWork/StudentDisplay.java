package CollectionFrameWork;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentDisplay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        float totalMark = 0;
        int fullMarks = 5 * 100;
        float percentage;

        System.out.print("Please enter the total number of students :-");
        int totalNumberOfStudent = scanner.nextInt();

        System.out.print("Please inter the student symbol number :- ");
        int studentSymbolNumber=scanner.nextInt();

        List<String> studentName = new ArrayList<>();
        studentName.add("Kamal Saru");
        studentName.add("John Sen");
        studentName.add("George Olivia");
        studentName.add("Emily Miller ");
        studentName.add("Justin viber");

        List<StudentDetails> studentList = new ArrayList<>();

        List<String> subject = new ArrayList<>();
        subject.add("Math");
        subject.add("English");
        subject.add("Science");
        subject.add("History");
        subject.add("Social");


        for (int i = 0; i < totalNumberOfStudent; i++) {
            String name = "Kamal";
            int grade = 5;
            short age=12;
            String section="A";
            short rollNumber=1;
            String phoneNumber="12545";
            String email= "kjdskjkdfk";
            String address="jkdfjkjdk";

            List<Float> markList=new ArrayList<>();//user input marks
            for (int j = 0; j <subject.size(); j++) {
                System.out.println("Student Name :- " + studentName.get(i) + "\nSubject Name :- " + subject.get(j));
                System.out.print("Enter the mark obtained :- ");
                float subjectMark = scanner.nextFloat();
                 //space between the line
                markList.add(subjectMark);
            }

            studentList.add(new StudentDetails(name, grade, age, section,rollNumber, phoneNumber,email,address, markList));
        }

        Iterator studentListIterator= studentList.iterator();
        while (studentListIterator.hasNext()){
            StudentDetails student= ((StudentDetails)studentListIterator.next());
            student.displayDetails();


            Iterator subjectMarkIterator = student.getMarks().iterator();
            while (subjectMarkIterator.hasNext())//check until the last number
            {
                totalMark+=(float)subjectMarkIterator.next();
            }

            percentage=totalMark/subject.size();
            if (percentage >= 90) {
                System.out.println("Congratulation !!! your grade is A.");
            } else if (percentage >= 80) {
                System.out.println("Congratulation !!! your grade is B.");
            } else if (percentage >= 70) {
                System.out.println("Satisfying !!! your grade is C.");
            } else if (percentage >= 60) {
                System.out.println("You need work hard !!! your grade is D.");
            } else {
                System.out.println("Sorry !!! you failed.");
            }
            System.out.println("\t\tThank You!!!");
            System.exit(0);
        }
    }
}
