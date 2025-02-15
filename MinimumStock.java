import java.util.*;

class MinimumStock {
    public static List<Integer> minStockPrices(int[] prices, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            // Remove elements out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements larger than the current element (they are useless)
            while (!deque.isEmpty() && prices[deque.peekLast()] > prices[i]) {
                deque.pollLast();
            }

            deque.addLast(i);

            // Store the min when the first k elements are processed
            if (i >= k - 1) {
                result.add(prices[deque.peekFirst()]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stockPrices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        System.out.println(minStockPrices(stockPrices, k));
    }
}
