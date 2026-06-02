import java.util.Scanner;

public class DecToBin {

    public static int decimalToBinary(int decNum) {
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;

            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }

        return binNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();

        int binary = decimalToBinary(decNum);

        System.out.println("Binary Number = " + binary);

        sc.close();
    }
}