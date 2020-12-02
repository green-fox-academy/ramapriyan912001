import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        printArr(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        printArr(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function as a way to print
        // array returned from subInt(). You could just as well iterate over array to print it.
    }

    public static int[] subInt(int digit, int[] array) {
        String digitString = String.valueOf(digit);
        int count = 0;
        int[] tentativeAnswer = new int[array.length];
        for (int i: array) {
            String tempString = String.valueOf(i);
            if (tempString.indexOf(digitString) != -1) {
                tentativeAnswer[count] = i;
                count++;
            }
        }
        int[] finalAnswer = Arrays.copyOf(tentativeAnswer, count+1);
        return finalAnswer;
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

}
