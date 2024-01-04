package BasicJavaLearning.BreakContinue;

public class Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;   //continue skip the value of i==4
            }
            System.out.println(i);   //print all the value of i
            i++;
        }
    }
}
