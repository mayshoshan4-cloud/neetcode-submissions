class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer , Integer> dp = new HashMap<>();
        dp.put(0 , 1);
        for (int num : nums) {
            HashMap<Integer , Integer> temp = new HashMap<>();
            for (Map.Entry<Integer , Integer> entry : dp.entrySet()) {
                int currSum = entry.getKey();
                int currCount = entry.getValue();

                int plus = currSum + num;
                if (!temp.containsKey(plus)) {
                    temp.put(plus , currCount);
                }
                else {
                    temp.put(plus , temp.get(plus) + currCount);
                }

                int minus = currSum - num;
                if (!temp.containsKey(minus)) {
                    temp.put(minus , currCount);
                }
                else {
                    temp.put(minus , temp.get(minus) + currCount);
                }

            }
            dp = temp;
        }
        if (!dp.containsKey(target)) {
            return 0;
        }
        return dp.get(target);
        
    }
}
