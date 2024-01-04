package JavaClass.Encapsulation;

public class GetSetTestEmployee {
    public static void main(String[] args) {
        GetSetEmployee employee=new GetSetEmployee();//("Kamal", 25, "Baltimore", 25000f )
        //String name = employee.getName("Kamal");
        System.out.println("Employee Details");
        employee.setName("Kamal");
        employee.setAge(34);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());

    }
}
