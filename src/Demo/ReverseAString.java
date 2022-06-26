package Demo;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        String[] str = words.split(" ");
        //String reverse = "";
        StringBuilder reverse = new StringBuilder();
        //for(int i = 0; i < str.length; i++){
        for (String s : str) {
            for (int j = s.length() - 1; j >= 0; j--) {
                // reverse += str[i].charAt(j);
                reverse.append(s.charAt(j));
            }
            System.out.print(reverse + " ");
            //reverse = "";
            reverse = new StringBuilder();
        }
    }
}
