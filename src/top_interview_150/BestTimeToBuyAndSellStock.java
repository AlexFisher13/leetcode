package top_interview_150;
/**
 * EASY
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
 * Возьмем первое цену как минимальную цену покупки.
 * Будем пробегать по всем ценам.
 * Оносительно каждой новой цены вычислять потенциальный профит. И если он больше предыдущего профита, то обновлять его.
 * Также будем искать меньшую цену покупки, и обновлять ее при нахождении. И дальше уже от нее искать профит.
 * Если от нее профит не будет найден, то мы профит и не обновим.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{2, 4, 1};
        int maxProfit = getMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int getMaxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int potentialProfit = currentPrice - minPrice;

            maxProfit = Math.max(potentialProfit, maxProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }


        return maxProfit;
    }
}
