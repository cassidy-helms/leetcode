package com.leetcode.best_time_buy_and_sell_stock_multiple;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.leetcode.best_time_to_buy_and_sell_stock_multiple.BestTimeToBuyAndSellStockMultiple;

@RunWith(Parameterized.class)
public class BestTimeToBuyAndSellStockMultipleTest {
    private int[] prices;
    private int expectedResult;
    private BestTimeToBuyAndSellStockMultiple app;

    @Before
    public void initialize() {
        app = new BestTimeToBuyAndSellStockMultiple();
    }

    public BestTimeToBuyAndSellStockMultipleTest(int[] prices, int expectedResult) {
        this.prices = prices;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> arrays() {
        return Arrays.asList(new Object[][] {
            {new int[] {7, 1, 5, 3, 6, 4}, 7},
            {new int[] {1, 2, 3, 4, 5}, 4},
            {new int[] {7, 6, 4, 3, 1}, 0},
            {new int[] {1}, 0},
        });
    }

    @Test
    public void testMaxProfit()
    {
        assertEquals(expectedResult, app.maxProfit(prices));
    }
}
