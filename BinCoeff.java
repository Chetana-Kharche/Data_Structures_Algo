import java.util.Scanner;

public class BinCoeff {

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate binomial coefficient nCr
    static long binomialCoeff(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial
        System.out.print("Enter number for factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial = " + factorial(num));

        // Binomial Coefficient
        System.out.print("Enter n and r for nCr: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient (nCr) = " + binomialCoeff(n, r));

        sc.close();
    }
}