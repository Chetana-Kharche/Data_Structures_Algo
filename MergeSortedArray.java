import java.util.Scanner;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[idx] = nums1[i];
                i--;
            } else {
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }

        while (j >= 0) {
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input m
        System.out.print("Enter number of elements in first array: ");
        int m = sc.nextInt();

        int[] nums1 = new int[m + 100]; // extra space for merging

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input n
        System.out.print("Enter number of elements in second array: ");
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}