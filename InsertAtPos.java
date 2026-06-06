import java.util.*;

public class InsertAtPos {

    public static int searchInsert(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println(searchInsert(arr, target));
    }
}