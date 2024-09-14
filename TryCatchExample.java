import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = scan.nextInt();
        try {
            System.out.println(10/a);
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("This block run on both cases");
        }
        System.out.println("Run successfully1");
    }
}
