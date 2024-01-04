//**********************************************************
package CollectionFrameWork;
import java.text.DecimalFormat;
import java.util.*;

public class StudentArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        float totalMark = 0;
        int fullMarks = 5 * 100;

        List<String> studentName = new ArrayList<>();
        studentName.add("Kamal Saru");
        /*studentName.add("John Sen");
        studentName.add("George Olivia");
        studentName.add("Emily Miller ");
        studentName.add("Justin viber");*/

        List<String> majorSubject = new ArrayList<>();
        majorSubject.add("Math");
        majorSubject.add("English");
        majorSubject.add("Science");
        majorSubject.add("History");
        majorSubject.add("Social");

        List<String> optionalSubject = new ArrayList<>();
        optionalSubject.add("Education");
        optionalSubject.add("Economics");

        List<Float> markList=new ArrayList<>();//user input marks
        for (int i = 0; i < studentName.size(); i++) {
            for (int j = 0; j < majorSubject.size(); j++) {
                System.out.println("Student Name :- " + studentName.get(i) + "\nSubject Name :- " + majorSubject.get(j));
                System.out.print("Enter the mark obtained :- ");
                float subjectMark = scanner.nextFloat();
                 //space between the line
                markList.add(subjectMark);
                totalMark += subjectMark; //add all user input marks
            }
        }

        float percentage=(totalMark/fullMarks)*100;
        System.out.println("You get "+df.format(percentage)+"%.");//Decimal format

        Iterator subjectMarkIterator = markList.iterator();
        while (subjectMarkIterator.hasNext())//check until the last number
        {
            if ((float)subjectMarkIterator.next() >= 90) {
                System.out.println("Congratulation !!! your grade is A.");
            } else if ((float)subjectMarkIterator.next() >= 80) {
                System.out.println("Congratulation !!! your grade is B.");
            } else if ((float)subjectMarkIterator.next()>= 70) {
                System.out.println("Satisfying !!! your grade is C.");
            } else if ((float)subjectMarkIterator.next() >= 60) {
                System.out.println("You need work hard !!! your grade is D.");
            } else {
                System.out.println("Sorry !!! you failed.");
            }
            System.out.println("Thank You!!!");
            System.exit(0);
        }
    }
}
