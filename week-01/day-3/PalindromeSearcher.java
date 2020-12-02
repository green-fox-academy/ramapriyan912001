import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PalindromeSearcher {
    public static List<String> palindromeSearcher(String thing) {
        char[] input = thing.toCharArray();
        int[] partial = new int[input.length];
        Arrays.fill(partial, 0);
        int[][] dp = new int[input.length][input.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Arrays.copyOf(partial, input.length);
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        printArr(dp);
        Set<String> set = new HashSet<>();
        for (int i = input.length-1; i >= 0; i--) {
            for (int j = input.length-1; j>i; j--) {
                if ((input[i] == input[j]) && (i!=j) && ((j == i + 1) || (dp[i + 1][j - 1] == 1))) {
                    dp[i][j] = 1;
                    String temp = String.valueOf(Arrays.copyOfRange(input, i, j+1));
                    if (temp.length() > 2);
                    set.add(temp);
                }
            }
        }
        List<String> list = set.stream().collect(Collectors.toList());
        return list;
    }

    public static void printArr(int[][] array) {
        for (int i = 0; i<array.length;i++) {
            int[] temp = array[i];
            printArr(array[i]);
            System.out.println();
        }
    }

    public static void printArr(int[] array) {
        for (int i = 0; i<array.length;i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("lllslf");
        System.out.println(palindromeSearcher("dog goat dad duck doodle never"));
        System.out.println(palindromeSearcher("racecar"));
    }
}
