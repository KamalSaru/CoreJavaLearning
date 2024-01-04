package JavaClass.StringMethod;

public class StudentDemo {
    short rollNo;
    String name;
    String address;
    String email;
    String dob;
    int phoneNumber;
    char grade;
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo();
        s1.name= "Kamal";
        s1.address= "Baltimore";


        StudentDemo s2 = new StudentDemo();
        s2.name = "Maya";
        s2.address ="Virginia";

        System.out.println(s1.name);
        System.out.println(s1.address);

    }
}
