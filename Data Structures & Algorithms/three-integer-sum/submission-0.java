class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int curr = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[right] + nums[left] + curr;
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[right]);
                    list.add(nums[left]);
                    list.add(curr);
                    threes.add(list);
                    left ++;
                    right --;
                    while (left < right && nums[left ]== nums[left - 1]) {
                        left ++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right --;
                    }
                }
                else if (sum < 0) {
                    left ++;
                }
                else {
                    right --;
                }
            }

        }
        return threes;
        
    }
}
