class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        for (char c : s1.toCharArray()) { // מערך תדירויות לתת מחרוזת
            count1[c - 'a'] ++;
        }
        int[] count2 = new int[26];
        int left = 0;
        int right = 0;
        while (right < s1.length()) {
            count2[s2.charAt(right) - 'a'] ++;
            right ++;
        }
        while (right < s2.length()) {
            if (Arrays.equals(count1 , count2)) {
                return true;
            }
            count2[s2.charAt(right) - 'a'] ++;
            right ++;
            count2[s2.charAt(left) - 'a'] --;
            left ++;
        }
        return Arrays.equals(count1 , count2);
        
    }
}
