import java.util.*;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for N: ");
        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println("N should be greater than 0.");
            return;
        }

        double harmonicValue = calculateHarmonicNumber(N);
        System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);
    }

    static double calculateHarmonicNumber(int N) {
        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }
        return harmonicValue;
    }
}
