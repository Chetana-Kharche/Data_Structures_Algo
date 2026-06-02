public class Kadanes {

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        // Check if all elements are negative
        int largestNegative = Integer.MIN_VALUE;
        boolean allNegative = true;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                allNegative = false;
            }
            largestNegative = Math.max(largestNegative, numbers[i]);
        }

        // If all elements are negative
        if (allNegative) {
            System.out.println("Our max subarray sum is : " + largestNegative);
            return;
        }

        // Normal Kadane's Algorithm
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        System.out.println("Our max subarray sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, -1, -4};

        kadanes(numbers);
    }
}
