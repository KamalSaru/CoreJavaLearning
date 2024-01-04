package DatabaseManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentsPaymentsInsert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //provide database driver name
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstproject", "root", "Tanuja123");

            //Students payments details.................................................................................
            System.out.print("Enter student payment ID :- ");
            int Payment_ID=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the payment date :- ");
            String Payment_Date=scanner.nextLine();
            System.out.print("Enter the total amount due :- ");
            Double Total_Amount=scanner.nextDouble();
            System.out.print("Total amount paid :- ");
            Double Amount_Paid=scanner.nextDouble();
            //Remaining balance formula
            double Balance=Total_Amount-Amount_Paid;
            System.out.print("Enter students ID :- ");
            int ID=scanner.nextInt();

            /*PreparedStatement pstmt=
                    connection.prepareStatement("Update students_payment set payment_date=? where id=?");
            pstmt.setDate(1, Date.valueOf(LocalDate.of(2023-06-16)));
            pstmt.setInt(2, 3);*/


            PreparedStatement studentsPayment=
                    connection.prepareStatement("Insert into students_payment (Payment_ID, Payment_Date, Total_Amount, Amount_Paid, Balance,ID) values (?,?,?,?,?,?)");
            studentsPayment.setInt(1, Payment_ID);
            studentsPayment.setString(2,Payment_Date);
            studentsPayment.setDouble(3, Total_Amount);
            studentsPayment.setDouble(4, Amount_Paid);
            studentsPayment.setDouble(5, Balance);
            studentsPayment.setInt(6, ID);
            int rowInserted = studentsPayment.executeUpdate();
            if (rowInserted>0){
                System.out.println("Students payment inserted successfully.");
            } else {
                System.out.println("Students payment not inserted.");
            }

        } catch (Exception e) {
            e.printStackTrace(); //it prints exception details
        }
    }
}
