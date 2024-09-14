import java.io.File;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            File fileObj = new File("testFile.txt");
            Scanner reader = new Scanner(fileObj);
            while(reader.hasNextLine()){
                String datas = reader.nextLine();
                System.out.println(datas);
            }
            reader.close();
            
        } catch (Exception e) {
            System.out.println("Some error has occured");
        }
    }
}
