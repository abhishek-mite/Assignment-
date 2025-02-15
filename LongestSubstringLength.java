import java.util.*;

public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;

        Set<Character> mySet = new HashSet<>();
        for(int index = 0; index < s.length(); index++){
            if(!mySet.contains(s.charAt(index))){
                mySet.add(s.charAt(index));
                maxLength = Math.max(maxLength,index-left+1);
            }
            else{
                while(mySet.contains(s.charAt(index))){
                    mySet.remove(s.charAt(left));
                    left++;
                }
                mySet.add(s.charAt(index));
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Length of Longest SubString: "+lengthOfLongestSubstring("abcbba"));
    }
}
