/*You are building a stock price analysis tool. One feature of this tool is to find the next greater price for
each day's stock price in an array of daily stock prices. Write a function that takes an array of daily stock 
prices as input and returns an array where each element is replaced by the next greater element to its right. 
If there is no greater element, replace it with -1. */
import java.util.Arrays;

public class NextGreaterElement {
    public static int[] findNextGreater(int[] arr, int index) {
        
        if (index == arr.length) {
            return new int[arr.length]; 
        }

        int[] result = findNextGreater(arr, index + 1);

        result[index] = -1; 
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] > arr[index]) {
                result[index] = arr[j];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = findNextGreater(arr,0);
        System.out.println(Arrays.toString(result));
    }
}
