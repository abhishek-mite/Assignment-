//Question-5
import java.util.*;

public class UniqueDigit {

    
    public static List<Integer> getUniqueDigits(int[] numbers) {
        Set<Integer> digitSet = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            String numStr = String.valueOf(numbers[i]); // it is to Convert number to string

           
            for (int j = 0; j < numStr.length(); j++) {
                int digit = Character.getNumericValue(numStr.charAt(j));
                digitSet.add(digit); 
            }
        }
        
        return new ArrayList<>(digitSet);//returning as list
    }

    public static void main(String[] args) {
        int[] N = {111, 222, 333, 4444, 666};
        List<Integer> uniqueDigits = getUniqueDigits(N);

        System.out.println(uniqueDigits);
    }
}
