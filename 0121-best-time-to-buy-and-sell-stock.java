// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int curProfit = 0;

        for (int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                curProfit = price - minPrice;
                if (curProfit > maxProfit)
                    maxProfit = curProfit;
            }
        }

        return maxProfit;
    }
}