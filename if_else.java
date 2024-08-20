import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        System.out.println("Enter the code:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a==10){
            System.out.println("you are right and typed "+a);
        }
        else if(a == 15){
            System.out.println("you right and types"+a);
        }
        else{
            System.out.println("try again");
        }
    }
    
}
