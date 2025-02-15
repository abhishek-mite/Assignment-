//Question - 1
public class InversionCount{

    public static int countInversions(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++; 
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {30, 45, 25, 60, 20};
        System.out.println("Inversion count for arr1: " + countInversions(arr1));  //printing
    }
}
 
