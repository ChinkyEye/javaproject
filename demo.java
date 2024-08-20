import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Enter your name,age and salary:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        float salary = scan.nextFloat();

        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your salary is "+ salary);
    }
}
