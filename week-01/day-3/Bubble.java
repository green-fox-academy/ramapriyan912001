import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static int[] bubble(int[] input) {
        Arrays.sort(input);
        return input;
    }

    public static int[] reverseBubble(int[] input) {
        Arrays.sort(input);
        return Reverse.reverse(input);
    }

    public static int[] advancedBubble(int[] input, boolean posNeg) {
        return posNeg ? reverseBubble(input) : bubble(input);
    }
}
