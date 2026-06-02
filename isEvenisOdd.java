import java.util.Scanner;

public class isEvenisOdd {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Even Number");
        }

        if (isOdd(n)) {
            System.out.println("Odd Number");
        }

        sc.close();
    }
}