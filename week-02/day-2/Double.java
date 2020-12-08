import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Double {
    public static void main(String[] args) {

    }

    public static void decrypt() {
        Path path = Paths.get("./week-02/day-2/double.txt");
        try {
            List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (int i = 0; i < content.size(); i++) {
                String line = content.get(i);
                String[] strings = line.split("  ");

            }
        } catch (IOException e) {
            System.out.println("Well that was unexpected!")
        }
    }

    public static void singulate(String[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static void removeDuplicateLetters(String word) {
        char[] arr = word.toCharArray();
        StringBuilder s = new StringBuilder();
        char tracker = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (tracker != arr[i]) {
                tracker = arr[i];
            } else {
        }
    }
}
