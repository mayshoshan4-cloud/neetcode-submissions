class Solution {
    public int maxProfit(int[] prices) {
        int hold = - prices[0]; //יש בידי מנייה (מלפני או מהיום)
        int rest = 0; // אני ביום מנוחה הו לא רכשתי או שאתמול מכרתי
        int sell = 0; // מכרתי היום מנייה

        for (int i = 1; i < prices.length; i ++) {
            int prevHold = hold;
            int prevRest = rest;
            int prevSell = sell;

            sell = prevHold + prices[i];
            rest = Math.max(prevRest , prevSell);
            hold = Math.max(prevHold , prevRest - prices[i]);
        }
        return Math.max(sell , rest);
    }

}
