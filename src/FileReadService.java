import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public void readFromFile(String filePath){
        FileInputStream fin;

        try {
            fin = new FileInputStream(filePath);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
