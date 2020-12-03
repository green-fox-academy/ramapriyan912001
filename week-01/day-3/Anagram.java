public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("dog", "god"));
    }

    public static boolean anagram(String input, String other) {
        if (input.length() != other.length()) {
            return false;
        }
        int left = 0;
        int right = input.length() - 1;
        char[] array = input.toCharArray();
        char[] compare = other.toCharArray();
        boolean answer = true;
        while (left < input.length()) {
            if (array[left] == compare[right]) {
                left++;
                right--;
            } else {
                answer = false;
                break;
            }
        }
        return answer;
        // Return anagram
    }
}
