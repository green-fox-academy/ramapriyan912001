import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        copy("./week-02/day-2/loremIpsum.txt", "./week-02/day-2/my-file.txt");

    }

    private static boolean copy(String src, String dst) {
        Path srcPath = Paths.get(src);
        Path dstPath = Paths.get(dst);
        try {
            List<String> srcContent = Files.readAllLines(srcPath);
            Files.write(dstPath, srcContent);
            return true;
        } catch(IOException e) {
            return false;
        }
    }
}
