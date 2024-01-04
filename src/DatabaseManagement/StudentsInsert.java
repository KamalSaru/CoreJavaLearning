package DatabaseManagement;

import java.sql.*;
import java.util.Scanner;

//Statement – Used to execute string-based SQL queries.
//PreparedStatement – Used to execute parameterized SQL queries
//Prepared statements are much faster when you have to run the same statement multiple times, with different data

public class StudentsInsert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //provide database driver name
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstproject", "root", "Tanuja123");

            //Students details list.....................................................................................
            System.out.print("Please enter the student name : -");
            String name = scanner.nextLine();
            System.out.print("Please enter gender:- ");
            String gender=scanner.nextLine();
            System.out.print("Enter date of birth:- ");
            String dob= scanner.nextLine();
            System.out.print("Enter your age:- ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your address:- ");
            String address= scanner.nextLine();
            System.out.print("Enter your phone number:- ");
            String phone_number=scanner.nextLine();
            System.out.print("Enter your email:- ");
            String email=scanner.nextLine();

            PreparedStatement preparedStatement=
                    connection.prepareStatement("Insert into students (name, gender, dob, age, address, phone_number, email) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2,gender );
            preparedStatement.setString(3, dob);
            preparedStatement.setInt(4, age);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, phone_number);
            preparedStatement.setString(7, email);
            int rowInserted = preparedStatement.executeUpdate();
            if (rowInserted>0){
                System.out.println("Students details inserted successfully.");
            } else {
                System.out.println("Student details not inserted.");
            }

        } catch (Exception e) {
            e.printStackTrace(); //it prints exception details
        }
    }
}
