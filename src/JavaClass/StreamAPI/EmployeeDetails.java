package JavaClass.StreamAPI;

import java.util.List;

public class EmployeeDetails {
    String name;
    int age;
    String gender;
    String company;
    String position;
    float salary;
    String citizen;

    public EmployeeDetails(String name, int age, String gender, String company, String position, float salary, String citizen) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.position = position;
        this.salary = salary;
        this.citizen = citizen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public void EmployeeDetailsDisplay() {
        System.out.println(name);
        System.out.println(age);
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", citizen='" + citizen + '\'' +
                '}';
    }

}
