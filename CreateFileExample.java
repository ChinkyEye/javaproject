import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) throws IOException {
        File myFile = new File("testFile.txt");
        if (myFile.createNewFile()) {
            System.out.println("File has created");
        }else{
            System.out.println("File already exit");
        }
    }
}
