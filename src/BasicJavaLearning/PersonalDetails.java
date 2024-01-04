package BasicJavaLearning;

public class PersonalDetails {
    public  static void main(String[] args) {
        String fName= "Kamal";
        String lName="Saru";
        String fullName= fName + " " +lName;
        String education ="Wilmington University";
        String graduationDate="May 2021";
        String address = "Baltimore Maryland USA";
        int contact_number = 410000000;
        String email="kamalsaru723@gmail.com";


        System.out.println("My name is  "+ fullName);
        System.out.println("I graduate from "+ education + " in " + graduationDate +".");
        System.out.println("Contact Number is " + contact_number);
        System.out.println("Email : "+email);

    }

}
