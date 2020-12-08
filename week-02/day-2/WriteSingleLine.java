import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        manipulateFile("Ramapriyan", "./week-02/day-2/my-file.txt");
    }

    public static void manipulateFile(String name, String filename) {
        Path path = Paths.get(filename);
        try {
            Files.writeString(path, name);
            System.out.println("Writing successful");
        } catch (IOException e) {
            System.err.println("Unable to write file: my-file.txt");
        }
    }
}
