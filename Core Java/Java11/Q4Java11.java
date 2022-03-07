package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Q4Java11 {
    public static void main(String[] args) throws IOException {
        var p = "src/Studentlist.txt";
        String out = Files.readString(Path.of(p));
        List<String> lines = out.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip).toList();
        System.out.println("names : "+lines+" \ncount : "+lines.size());
    }
}