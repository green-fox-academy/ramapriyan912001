import java.util.Arrays;

public class Reverse {
    public static void main(String [] args) {
        int[] numbers = {3,4,5,6,7};
        System.out.println(reverse(numbers));
    }

    public static int[] reverse (int[] input) {
        int[] numbers = Arrays.copyOf(input, input.length);
        int left = 0;
        int right = numbers.length-1;
        while(left<right) {
            int temp = numbers[right];
            numbers[right] = numbers[left];
            numbers[left] = numbers[right];
            left++;
            right--;
        }
        return numbers;
    }
}
