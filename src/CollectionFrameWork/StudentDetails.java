package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
    String name;
    int grade;
    short age;
    String section;
    short rollNumber;
    String phoneNumber, email, address;
    List<Float> marks; //data type List<Float>(list of float)

    public StudentDetails(String name, int grade, short age, String section, short rollNumber, String phoneNumber, String email, String address, List<Float>marks) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.section = section;
        this.rollNumber=rollNumber;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
        this.marks=marks;

    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getGrade(){return grade;}
    public void setGrade(int grade){
        this.grade=grade;
    }
    public short getAge(){return age;}
    public void setAge(short age){
        this.age=age;
    }
    public String getSection(){ return section;}
    public void setSection(String section){
        this.section=section;
    }
    public short getRollNumber() {return rollNumber;}
    public void setRollNumber(short rollNumber){
        this.rollNumber=rollNumber;
    }
    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getEmail(){return email;}
    public void setEmail(String email){
        this.email=email;
    }
    public String getAddress(){return address;}
    public void setAddress(String address){
        this.address=address;
    }
    public List<Float> getMarks(){
        return marks;
    }
    public void setMarks(List<Float> marks){
        this.marks=marks;
    }

    public void displayDetails()
    {
        System.out.println("Name is:- "+name);
        System.out.println("Grade is "+grade);
        System.out.println("Age is:- "+age);
        System.out.println("Section is:- "+section);
        System.out.println("Roll Number is:- "+rollNumber);
        System.out.println("Phone number is:- "+phoneNumber);
        System.out.println("Email address is:- "+email);
        System.out.println("Address is:- "+address);
        System.out.println(marks);
    }
}
