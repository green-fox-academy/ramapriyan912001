import java.util.Arrays;

public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(createPalindrome("greenfox"));
        System.out.println(createPalindrome(""));
    }

    public static String createPalindrome(String input) {
        if (input.length() == 0) {
            return "";
        }
        int count = 0;
        char[] temp = input.toCharArray();
        char[] answer = Arrays.copyOf(temp, 2*input.length());
        int index = input.length();
        int right = input.length()-1;
        while(right > -1) {
            answer[index] = temp[right];
            index++;
            right--;
        }
        return String.valueOf(answer);
    }
}
