package DatabaseManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.Scanner;


public class MarksheetInsert {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    DecimalFormat df= new DecimalFormat("0.00");
    Connection connection = null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); //provide database driver name
        connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstproject", "root", "Tanuja123");

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("Please enter the student roll_number:- ");
        int roll_No=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the student Full name :- ");
        String students_Name=scanner.nextLine();
        System.out.print("Mark obtained in Math :- ");
        float math=scanner.nextFloat();
        System.out.print("Mark obtained in Science :- ");
        float science=scanner.nextFloat();
        System.out.print("Mark obtained in English :- ");
        float english=scanner.nextFloat();
        System.out.print("Mark obtained in Nepali :- ");
        float nepali=scanner.nextFloat();
        System.out.print("Mark obtained in Opt_Math :- ");
        float opt_Math=scanner.nextFloat();

        //mark calculation
        float total_Martk=math+science+english+nepali+opt_Math;
        System.out.println(df.format(total_Martk)); //total mark obtained in full 500

        float percentage=(total_Martk/500) *100; //obtained percentage
        System.out.println(df.format(percentage));

        //grade calculation
         String grade=scanner.nextLine();
            if (percentage >= 90) {
                System.out.println(grade="A");
            } else if (percentage >= 80) {
                System.out.println(grade="B");
            } else if (percentage >= 70) {
                System.out.println(grade="C");
            } else if (percentage >= 60) {
                System.out.println(grade="D");
            } else {
                System.out.println(grade="F");
            }
        System.out.print("Enter the mark sheet ID :-");
        int marksheet_ID=scanner.nextInt();

        PreparedStatement marksheet=
                connection.prepareStatement("Insert into marksheet (roll_No, students_Name,  math, science, english, nepali, opt_Math, total_Mark, percentage, grade, marksheet_ID) values (?,?,?,?,?,?,?,?,?,?,?)");
        marksheet.setInt(1, roll_No);
        marksheet.setString(2, students_Name);
        marksheet.setFloat(3, math);
        marksheet.setFloat(4, science);
        marksheet.setFloat(5, english);
        marksheet.setFloat(6, nepali);
        marksheet.setFloat(7, opt_Math);
        marksheet.setFloat(8, total_Martk);
        marksheet.setFloat(9, percentage);
        marksheet.setString(10, grade);
        marksheet.setInt(11,marksheet_ID);

        int rowInserted = marksheet.executeUpdate();
        if (rowInserted>0){
            System.out.println("Students marks inserted successfully.");
        } else {
            System.out.println("Student marks not inserted.");
        }
    } catch (Exception e) {
        e.printStackTrace(); //it prints exception details

    }
  }
}
