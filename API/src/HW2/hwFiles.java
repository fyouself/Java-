package src.HW2;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class hwFiles {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("API/src/HW2/new_file.txt");
        if (Files.notExists(path)){
            Files.createFile(path);
        }
        try(OutputStream newFile = Files.newOutputStream(path)){

            String output = " Hello world!!!!!!";
            byte [] bytes = output.getBytes();
            newFile.write(bytes);
        }

        try (InputStream inputStream = Files.newInputStream(path)){

            Scanner scanner = new Scanner(inputStream);
            System.out.println(scanner.nextLine());
            scanner.close();
        }






    }
}
