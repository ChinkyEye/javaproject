import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        try {
            File somefile = new File("FileFolder/apple8.txt");
            somefile.delete();
        } catch (Exception e) {
            System.out.println("error has occured");
        }
    }
}
