class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] count = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i ++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int temp = stack.pop();
                count[temp] = i - temp;
            }
            stack.push(i); // מכניסים את אינדקס האיבר שעדיין לא נמצא גבוה ממנו
        }
        return count;    
    }
}
