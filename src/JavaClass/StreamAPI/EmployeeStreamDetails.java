package JavaClass.StreamAPI;

import javax.xml.namespace.QName;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeStreamDetails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //DecimalFormat df=new DecimalFormat(0.00f);
        List<EmployeeDetails> employee = List.of(
                new EmployeeDetails("Kamal", 33, "Male", "Google", "Developer", 96000, "Nepal"),
                new EmployeeDetails("Abdul", 35, "Male","Microsoft", "Manager", 115000, "Pakistan"),
                new EmployeeDetails("Michal", 42, "Female", "Metros-tar", "Engineer", 135000, "USA"),
                new EmployeeDetails("Huag", 38, "Male", "Amazon", "SalesMan", 78000, "China"),
                new EmployeeDetails("Chung", 33, "Female", "Hopkins", "Nurse", 65000, "China"),
                new EmployeeDetails("Aditya", 45, "Male","Tesla", "Software", 112000, "India"),
                new EmployeeDetails("Raju", 32, "Male", "Hopkins", "Doctor", 178000, "Nepal"),
                new EmployeeDetails("Carlos", 27, "Male","Sinai", "Cleaner", 45000, "Mexico")
        );
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Total number of employees are :- "+employee.size());
        System.out.println("Number of employee under 35 years :- "+employee.stream().filter(emp->emp.getAge()<35).count());
        System.out.println("Number of employee over 40 years :- "+employee.stream().filter(emp->emp.getAge()>40).count());
        System.out.println();
        employee.stream().filter(emp->emp.getCitizen()=="Nepal").forEach(emp-> System.out.println("Employee from same country name are:- "+emp.getName()));
        System.out.println("Selected employee details :- "+employee.stream().toList().get(5));

        System.out.println();
        System.out.println("--------------Employees Details List------------------");
        employee.forEach(emp-> System.out.println(emp));

        System.out.println();
        System.out.println("Total number of female in the company:- "+employee.stream().filter(emp->emp.gender=="Female").count());
        employee.stream().filter(emp->emp.getGender()=="Female").forEach(emp-> System.out.println("Female name is "+emp.getName()));
        System.out.println("Total number of male in the company:- "+employee.stream().filter(emp->emp.gender=="Male").count());

        //findAny, no upperCase found.
        System.out.println(employee.stream().filter(emp->emp.getName().toUpperCase()=="Kamal").findAny());
        System.out.println(employee.stream().filter(emp->emp.getCompany()=="Hopkins").collect(Collectors.toList()));

        System.out.println();
        employee.stream().filter(emp->emp.salary<=78000).forEach(emp->System.out.println("Employee salary less than or equal to $78000 are:- "+emp.getName()));

        System.out.println();
        float totalEmployeeSalary=employee.stream().map(emp -> emp.salary).reduce(0.00f,Float::sum);
        System.out.println("Total expenses of company salary a year is:- "+totalEmployeeSalary);

        /*System.out.println();
        Iterator employeeIterator= employee.listIterator();
        while (employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }*/
    }
}
