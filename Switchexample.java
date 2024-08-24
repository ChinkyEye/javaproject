import java.util.Scanner;
public class Switchexample {
    public static void main(String[] args) {
        System.out.println("Switch Example");
        System.out.println("Enter the age:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        switch (age) {
            case 10:
                System.out.println("User age is 10");
                break;
            case 20:
                System.out.println("User age is 20");
                break;
            case 30:
                System.out.println("User age is 30");  
                break;  
            default:
            System.out.println("User age is not matching with any case");
                break;
        }
    }
}
