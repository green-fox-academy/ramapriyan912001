public class Sum {
    public static int sum(int input) {
        if (input == 0) {
            return 0;
        } else {
            return input + sum(input-1);
        }
    }
}
