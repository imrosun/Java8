package Practice;

public class LongestPalindrome {
    public static void main(String[] args) {
        String sh = "ababd";
        System.out.println(expand(sh,0,0));
    }
    // Wrong program
    public static String expand(String s, int l,int r) {

        while( l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
        String temp="";
        if(s.length()<=1)
            return s;
        for(int i=0; i<s.length(); i++){
            String even=expand(s,i,i+1);
            String odd=expand(s,i,i);
            if(odd.length()>temp.length())
                temp=odd;
            if(even.length()>temp.length())
                temp=even;
        }
        return temp;
    }

    public String longestPalindromeNew(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        int[] longest = new int[] {0, 0};
        int[] even;
        int[] odd;
        for (int i = 0; i < length; i++) {
            // odd length palindrome
            odd = extendPalindrome(c, i, i);
            if (odd[1] - odd[0] > longest[1] - longest[0]) {
                longest = odd;
            }
            // even length palindrome
            even = extendPalindrome(c, i, i + 1);
            if (even[1] - even[0] > longest[1] - longest[0]) {
                longest = even;
            }
        }

        return s.substring(longest[0] + 1, longest[1]);
    }

    private int[] extendPalindrome(char[] c, int left, int right) {
        while (left >= 0 && right < c.length && c[left] == c[right]) {
            left--;
            right++;
        }

        return new int[] {left, right};
    }
}
