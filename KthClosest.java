import java.util.Random;

public class KthClosest {
    
    public static int findKthClosest(int[] readings, int target, int k) {
        int[][] distances = new int[readings.length][2];

        for (int i = 0; i < readings.length; i++) {
            distances[i][0] = Math.abs(readings[i] - target); 
            distances[i][1] = readings[i]; 
        }

        return quickSelect(distances, 0, readings.length - 1, k - 1);
    }

    private static int quickSelect(int[][] arr, int start, int end, int k) {
        if (start == end)
            return arr[start][1]; 

        int pivotIndex = partition(arr, start, end);

        if (pivotIndex == k)
            return arr[pivotIndex][1]; 
        else if (pivotIndex < k)
            return quickSelect(arr, pivotIndex + 1, end, k); 
        else
            return quickSelect(arr, start, pivotIndex - 1, k); 
    }

    private static int partition(int[][] arr, int start, int end) {
        int pivotIndex = new Random().nextInt(end - start + 1) + start; 
        swap(arr, pivotIndex, end); 

        int pivotValue = arr[end][0]; 
        int i = start;

        for (int j = start; j < end; j++) {
            if (arr[j][0] < pivotValue) { 
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, end); 
        return i;
    }

    private static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74};
        int target = 73, k = 2;
        
        System.out.println("K-th Closest Reading: " + findKthClosest(readings, target, k)); // Output: 74
    }
}
