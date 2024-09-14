import java.io.FileWriter;

public class CreateMultipleFileExample {
    public static void main(String[] args) {
     try {
        for (int i = 0; i < 10; i++) {
            String fileName = "FileFolder/apple"+ i + ".txt";
            FileWriter writer = new FileWriter(fileName);
            writer.write("this is the dummy data" + fileName);
            writer.close();
        }
        
     } catch (Exception e) {
        System.out.println("Some error has occured");
     }   
    }
}
