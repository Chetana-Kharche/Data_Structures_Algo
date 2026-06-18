public static int storeWater(ArrayList<Integer> height) {

    int lp = 0;
    int rp = height.size() - 1;

    int maxWater = 0;

    while (lp < rp) {

        int ht = Math.min(height.get(lp), height.get(rp));
        int width = rp - lp;

        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);

        if (height.get(lp) < height.get(rp)) {
            lp++;
        } else {
            rp--;
        }
    }

    return maxWater;
}



// class Solution {
//     public int maxArea(int[] height) {

//         int left = 0;
//         int right = height.length - 1;

//         int maxWater = 0;

//         while (left < right) {

//             int ht = Math.min(height[left], height[right]);
//             int width = right - left;

//             int currWater = ht * width;

//             maxWater = Math.max(maxWater, currWater);

//             // Move pointer with smaller height
//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return maxWater;
//     }
// }
