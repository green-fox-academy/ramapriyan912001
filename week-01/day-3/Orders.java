public class Orders {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;
        System.out.println(numbers);
    }
}
