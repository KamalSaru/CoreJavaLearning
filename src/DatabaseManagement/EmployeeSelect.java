package DatabaseManagement;

import java.sql.*;

public class EmployeeSelect {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //provide database driver name
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstproject", "root", "Tanuja123"); //project name is myfirstproject

            Statement statement = connection.createStatement();
            ResultSet resultSet= statement.executeQuery("Select ID, Name, Gender, Age, DOB, Phone_Number, Address, Email, Salary, Remarks  from employee"); // project table name is employee
            while (resultSet.next()) {
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String address=resultSet.getString("address");
                String email=resultSet.getString("email");
                float salary=resultSet.getFloat("Salary");
                Date dob=resultSet.getDate("dob");

                //Employee employee= new Employee(null, Name, Gender, Age, DOB, Phone_Number, Address, Email, Salary, Remarks);
                //System.out.println(employee.getID);

                System.out.println(resultSet.getInt("id")+ " "+ resultSet.getString("Name")+" "+ resultSet.getInt("Age")+" " +resultSet.getDate("dob")+" "
                        +resultSet.getString("Gender")+" "+resultSet.getString("Phone_Number")+" "+resultSet.getString("address")+" "+
                resultSet.getString("email")+" "+resultSet.getString("Salary"));//print the necessary

            }

            //from the employee table
            ResultSet employee = statement.executeQuery("Select * from employee");
            while(employee.next());
        } catch (Exception e) {
            e.printStackTrace(); //it prints exception details
        }
    }
}
