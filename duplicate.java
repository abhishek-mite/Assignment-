import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3};
        HashSet<Integer> elements = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if(elements.contains(arr[i]))
            {
                System.out.println("duplicate IS:" +arr[i]);
                break;
            }     
            elements.add(arr[i]);
        }
    }
}
