package BasicJavaLearning.BreakContinue;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {    //print the value until i==4, and break
                break;
            }
        }
    }
}


