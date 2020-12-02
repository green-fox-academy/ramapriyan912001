import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        SubInt.printArr(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] unique(int[] array) {
        Arrays.sort(array);
        int[] tentativeAnswer = new int[array.length];
        int count = 0;
        int temp = Integer.MAX_VALUE;
        for(int i: array) {
            if (i != temp) {
                tentativeAnswer[count] = i;
                count++;
                temp = i;
            }
        }
        return Arrays.copyOf(tentativeAnswer, count+1);
    }
}
