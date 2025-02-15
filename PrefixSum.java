//Question - 2
import java.util.Arrays;

public class PrefixSum {

    public static int[] computePrefixSum(int[] sales) {
        int n = sales.length;

        for (int i = 1; i < n; i++) {
            sales[i] = sales[i - 1] + sales[i];
        }

        return sales;
    }

    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};
        int[] prefixSum = computePrefixSum(sales);

        System.out.println("PrefixSum[] = " + Arrays.toString(prefixSum));
    }
}

