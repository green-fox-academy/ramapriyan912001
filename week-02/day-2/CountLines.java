import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countlines("./week-02/day-2/my-file.txt"));
    }

    private static int countlines(String filename) {
        Path path = Paths.get(filename);
        try {
            List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
            return list.size();
        } catch (Exception e) {
            return 0;
        }
    }
}
