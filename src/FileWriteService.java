import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public String writeToFile(String filePath, String text) {
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(filePath);
            byte[] byteArr = text.getBytes();
            fos.write(byteArr, 0, byteArr.length);
            fos.close();
            System.out.println("\n<< Текст записано. Шлях до файлу " + filePath);
        } catch (IOException e) {
            return e.getMessage();
        }

        return "Success!";
    }

}
