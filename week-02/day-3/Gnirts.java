public class Gnirts implements CharSequence {

    private String field;

    public Gnirts(String field) {
        this.field = field;
    }

    public String reverse() {
        char[] arr = this.field.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }

    @Override
    public int length() {
        return this.field.length();
    }

    @Override
    public char charAt(int index) {
        return this.reverse().toCharArray()[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.reverse().subSequence(start, end);
    }
}
