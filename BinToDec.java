import java.util.Scanner;

public class BinToDec {

    public static int binaryToDecimal(int binNum) {
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;

            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        return decNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        int decimal = binaryToDecimal(binNum);

        System.out.println("Decimal Number = " + decimal);

        sc.close();
    }
}