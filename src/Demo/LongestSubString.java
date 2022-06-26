package Demo;


import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("abcdd");
        System.out.println(ans);

    }
    public static int lengthOfLongestSubstring(String s) {
        int start =0;
        int end = 0;
        int max=0;

        HashSet<Character> hs= new HashSet();
        while(end<s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
                max= Math.max(hs.size(),max);
            }else{
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
