public class PairSum {

    public static int[] pairSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int pairSum = nums[i] + nums[j];

            if (pairSum > target) {
                j--;
            } 
            else if (pairSum < target) {
                i++;
            } 
            else {
                return new int[]{i, j};
            }
        }

        return new int[]{-1, -1}; // Pair not found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 7;

        int[] result = pairSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}