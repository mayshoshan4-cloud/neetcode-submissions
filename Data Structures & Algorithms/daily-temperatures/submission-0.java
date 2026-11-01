class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] count = new int[size];
        int i = 0;
        int j = 1;
        while (i < size && j < size) {
            while (j < size) {
                if (temperatures[j] <= temperatures[i]) {
                    j ++;
                }
                else {
                    count[i] = j - i;
                    break;
                }
            }
            i++;
            j = i + 1;
        }
       return count; 
    }
}
