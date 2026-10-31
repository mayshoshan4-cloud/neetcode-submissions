class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] proArr = new int[nums.length];
        proArr[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            proArr[i] = proArr[i - 1] * nums[i - 1];
        }
        int rightPro = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            proArr[j] = proArr[j] * rightPro;
            rightPro *= nums[j];
        }
        return proArr;
        
    }
}  
