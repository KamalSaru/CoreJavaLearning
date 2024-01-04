package BasicJavaLearning;

import java.util.Scanner;

public class ScannerPersonalDetails {
    //**********************************************************************************
    /*nextBoolean() 	1 bit(store ture abd false) -Reads a boolean value from the user
    nextByte() 	        1 byte(-127 - 127) -Reads a byte value from the user
    nextDouble() 	    8 byte(15 decimal digit) -Reads a double value from the user
    nextFloat() 	    4 byte(6-7 decimal digit) -Reads a float value from the user
    nextInt() 	        4 byte(-2,147,483,648 to 2,147,483,647) -Reads a int value from the user
    nextLine() 	        Reads a String value from the user
    nextLong() 	        8 byte(-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 -Reads a long value from the user
    nextShort() 	    2 byte(-32,768 to 32,767) -Reads a short value from the user */
    //**********************************************************************************
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter your name : ");
        String name =scanner.nextLine();
        System.out.println("My name is " +name);

        System.out.print("Please enter your address : ");
        String address=scanner.nextLine();
        System.out.println("My address is : " +address);

        System.out.print("Please enter your date of birth : ");
        int dateOfBirth= scanner.nextInt();
        System.out.println("My date of birth is : "+ dateOfBirth);

        System.out.print("Please enter your phone number : ");
        long phoneNumber = scanner.nextLong();
        System.out.println("My phone number is "+ phoneNumber);

        System.out.print("Please enter your date of birth year :  ");
        short dateOfBirthYear = scanner.nextShort();
        short currentYear=2023;
        short myAge = (short) (currentYear-dateOfBirthYear);
        System.out.println("I am " + myAge +" years old.");

        System.out.print("Is this your age right ? True/False :  ");
        boolean myAgeIs = scanner.nextBoolean();
        if (myAgeIs) {
            System.out.println("My age is correct.");
        } else {
            System.out.println("My age is not correct.");
        }
    }
}
