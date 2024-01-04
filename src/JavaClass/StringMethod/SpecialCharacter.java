package JavaClass.StringMethod;

public class SpecialCharacter {
    public static void main(String[] args) {
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        String txt1 = "It\'s alright.";
        System.out.println(txt1);

        String txt2 = "The character \\ is called backslash.";
        System.out.println(txt2);

        String txt3 = "Hello\nWorld!";
        System.out.println(txt3);

        String txt4 = "Hello\rWorld!";
        System.out.println(txt4);

        String txt5 = "Hello\tWorld!";
        System.out.println(txt5);

        String txt6 = "Hel\blo World!";
        System.out.println(txt6);

    }
}
