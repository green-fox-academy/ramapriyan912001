public class Factorial {
    public static int factorial(int input) {
        if (input == 0) {
            return 1;
        } else {
            return input * factorial(input-1);
        }
    }
}
