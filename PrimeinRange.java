import java.util.Scanner;

class PrimeInRange{

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to print primes in a range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 2 to " + n + " are:");
        primeInRange(n);

        sc.close();
    }
}
