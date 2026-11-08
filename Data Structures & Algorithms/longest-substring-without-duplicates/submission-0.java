class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>(); // מאפ מונע חזרה על אות שכבר ראיתי
        int left = 0; // המחרוזת תהיה בין שמאל לימין
        int maxSub = 0;
        for (int right = 0; right < s.length(); right ++) {
            char curr = s.charAt(right);
            if (map.containsKey(curr) && map.get(curr) >= left) { //זו כפילות היא בתוך החלון שלי!!
                left = map.get(curr) + 1;
            }
            map.put(curr , right);
            maxSub = Math.max(maxSub , right - left + 1);
        }
        return maxSub;
    }

}
