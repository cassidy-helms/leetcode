package com.leetcode.best_time_to_buy_and_sell_stock_multiple;

/*
 * Practice Problem 122: Best Time to Buy and Sell Stock II
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockMultiple {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i - 1] < prices[i]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}
