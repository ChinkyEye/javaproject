import java.io.FileWriter;

public class WriteFileExample {
    public static void main(String[] args) {
        try{
            FileWriter myfilwriter = new FileWriter("testFile.txt");
            myfilwriter.write("This is writtin inside file");
            myfilwriter.close();
    
        } catch(Exception e)
        {
            System.out.println("Some Exception has occured");
        }
    }

}
