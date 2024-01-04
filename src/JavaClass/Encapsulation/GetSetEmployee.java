package JavaClass.Encapsulation;

//Encapsulation, is to make sure that "sensitive" data is hidden from users
//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable
//The get method returns the variable value, and the set method sets the value.
//Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case

public class GetSetEmployee {
    private String name;
    private int age;
    private String address;
    private float salary;

    public GetSetEmployee(){}

public GetSetEmployee(String name, int age, String address, float salary){
    this.name=name;
    this.age=age;
    this.address=address;
    this.salary=salary;
}
    /*public String getName(String username) { //for set the name, fixed
        if (username.equals("Kamal")) {
            return name;
        }
        return name;
    }*/
    public String getName(){
        return name;
    }
    public void setName(String name){ //set always in void because only read
        this.name=name;
    }
    public int getAge(){
         return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAddress(){
         return address;
    }
    public float getSalary(){
         return salary;
    }

    public void displayEmployee() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(salary);
    }
}
