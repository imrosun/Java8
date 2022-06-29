// Reverse a string without changing its place
package Practice;
import java.util.Scanner;

public class ReverseWithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original string : ");
        String originalStr = sc.nextLine();
        sc.close();

        String[] text = originalStr.split("\\s");
        String reversedString = "";
        for (int i = 0; i < text.length; i++) {
            String word = text[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}

