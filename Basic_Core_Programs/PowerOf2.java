import java.util.*;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanObj=new Scanner (System.in);

        int N = scanObj.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("N should be between 0 and 30 (inclusive).");
            return;
        }

        printPowersOf2(N);
        return ;
    }

    static void printPowersOf2(int N) {
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}