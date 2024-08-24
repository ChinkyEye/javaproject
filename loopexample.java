import java.util.Scanner;

public class loopexample {
    public static void main(String[] args) {
        System.out.println("Enter the value:");
        Scanner scan = new Scanner(System.in);
        int userVal =scan.nextInt(); 
        for(int i = 1;i<=userVal;i++)
        {
            System.out.println("5 * "+i+" = "+5*i);
        }
    }
}
