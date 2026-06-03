import java.util.Scanner;

public class xPown {

    public static double myPow(double x, int n) {

        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        if (x == 1) return 1.0;
        if (x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 0) return -1.0;

        long binForm = n;

        if (n < 0) {
            x = 1 / x;
            binForm = -binForm;
        }

        double ans = 1.0;

        while (binForm > 0) {
            if (binForm % 2 == 1) {
                ans *= x;
            }

            x *= x;
            binForm /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double result = myPow(x, n);

        System.out.println("Answer = " + result);

        sc.close();
    }
}