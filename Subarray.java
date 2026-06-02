import java.util.Scanner;

public class Subarray {

    public static void printSubarrays(int arr[]) {
        int ts=0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                ts++;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subarrays are:");
        printSubarrays(arr);

        sc.close();
    }
}