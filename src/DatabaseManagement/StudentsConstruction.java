package DatabaseManagement;
import java.sql.Date;

public class StudentsConstruction {
    private int ID;
    private  String  name;
    private String gender;
    private Date dob;
    private int age;
    private String address;
    private String phone_number;
    private String email;

    //Students Payments details................
    private Integer Payment_ID;
    private String Payment_Date;
    private  double Total_Amount;
    private double Amount_Paid;
    private double Balance;
    private int Student_ID;


    @Override
    public String toString() {
        return "Students{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +

                //Students payment details
                ", payment_ID=" + Payment_ID +
                ", payment_date=" + Payment_Date +
                ", Total_Amount=" + Total_Amount +
                ", Amount_paid=" + Amount_Paid +
                ", balance=" + Balance +
                ", Student_ID=" + Student_ID +
                '}';
    }

    public StudentsConstruction(Integer id, String name, String gender, Date dob, int age, String address, String phone_number, String email,
                                Integer Payment_ID, String Payment_Date, double Total_Amount, double Amount_Paid, double Balance, int Student_ID ){
        this.Student_ID=Student_ID;
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        this.age=age;
        this.address=address;
        this.phone_number=phone_number;
        this.email=email;

        //Students payments details............................
        this.Payment_ID=Payment_ID;
        this.Payment_Date=Payment_Date;
        this.Total_Amount=Total_Amount;
        this.Amount_Paid=Amount_Paid;
        this.Balance=Balance;
        this.Student_ID=Student_ID;
    }
    public Integer getId() {
        return ID;
    }
    public void setId(Integer id) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    //Student payments details
    public Integer getPayment_ID() {
        return Payment_ID;
    }
    public void setPayment_ID(Integer payment_ID) {
        this.Payment_ID = payment_ID;
    }
    public String getPayment_date() {return Payment_Date;}
    public void setPayment_date(String payment_date) {
        this.Payment_Date = payment_date;
    }
    public double getTotal_Amount() {
        return Total_Amount;
    }
    public void setTotal_Amount(double total_Amount) {
        Total_Amount = total_Amount;
    }
    public double getAmount_paid() {
        return Amount_Paid;
    }
    public void setAmount_paid(double amount_paid) {
        Amount_Paid = amount_paid;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        this.Balance = balance;
    }
    public Integer getID() {
        return Student_ID;
    }
    public void setID(Integer ID) {
        this.Student_ID = Student_ID;
    }
}
