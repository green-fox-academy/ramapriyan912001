public class Shifter implements CharSequence{

    private String field;
    private int shift;

    public Shifter(String field, int shift) {
        this.field = field;
        this.shift = shift;
    }


    @Override
    public int length() {
        return 0;
    }

    public String shift() {
        return field.substring(shift) + field.substring(0, shift);
    }

    @Override
    public char charAt(int index) {
        return this.shift().toCharArray()[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.shift().substring(start, end);
    }
}
