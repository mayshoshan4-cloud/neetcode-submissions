class Solution {
    public int characterReplacement(String s, int k) {
        int[] chars = new int[26]; //לכל התווים באנגלית
        int maxChar = 0;
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right ++) {
            char c = s.charAt(right);
            chars[c - 'A'] ++;
            maxChar = Math.max(maxChar , chars[c - 'A']);
            while ((right - left + 1) - maxChar > k ) {
                chars[s.charAt(left) - 'A'] --;
                left ++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }  
        return maxLen;
    }
}
