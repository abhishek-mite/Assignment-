//Question - 3
import java.util.Arrays;

public class Postfixsum {

    public static int[] computePrefixSum(int[] fuel) {
        int n = fuel.length;

        for (int i = n-2; i >= 0; i--) {
            fuel[i] = fuel[i + 1] + fuel[i];
        }

        return fuel;
    }

    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};
        int[] postfixSum = computePrefixSum(fuel);

        System.out.println("PrefixSum[] = " + Arrays.toString(postfixSum));
    }
}

