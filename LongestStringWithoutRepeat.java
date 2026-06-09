//longest repeated string without repeated characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        java.util.Arrays.fill(last, -1);

        int start = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (last[ch] >= start) {
                start = last[ch] + 1;
            }

            last[ch] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}
