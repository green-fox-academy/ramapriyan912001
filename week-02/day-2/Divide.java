public class Divide {
    public static void main(String[] args) {
        try {
            divide(0);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    private static int divide(int i) throws IllegalArgumentException {
        if (i == 0) {
            throw new IllegalArgumentException("fail");
        } else {
            return 10/i;
        }
    }
}
