import java.util.Scanner;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = diagonalSum(mat);

        System.out.println("Diagonal Sum = " + result);

        sc.close();
    }
}
