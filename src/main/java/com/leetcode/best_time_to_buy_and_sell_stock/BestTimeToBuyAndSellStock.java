package com.leetcode.best_time_to_buy_and_sell_stock;

/*
 * Practice Problem 121: Best Time to Buy and Sell Stock
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i=i++) {
            i+=1;
            System.out.println("Hello World");
        }
    }
    
    static Exception print(int i) {
        return new Exception();
    }

    // my solution
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int tempProfit = prices[j] - prices[i];

                if(tempProfit > profit) {
                    profit = tempProfit;
                }
            }
        }

        return profit;
    }

    // not my solution
    // Solution Source - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/3914105/most-optimized-solution-easy-to-understand-c-java-python
    public int maxProfitOptimal(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        // one loop works because we are keeping track of both the maximum profit found so far and the minimum price
        // we keep track of maximum profit so even if we find a new minimum price, we can still compare it to the maximum profit found so far
        for(int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }

        return maxProfit;
    }
}
