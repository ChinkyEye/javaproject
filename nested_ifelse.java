import java.util.Scanner;
public class nested_ifelse {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.nextLine();
        if(age > 20){
            System.out.println("you are eligible");
            System.out.println("Enter your gender:");
            String gender = scan.nextLine();  
            if(gender.equalsIgnoreCase("male")){
                System.out.println("you are welcome");
            }
            else if(gender.equalsIgnoreCase("female")){
                System.out.println("ypu are not welcome");
            }
        }
        else{
            System.out.println("you are not eligible");
        }
        scan.close();
    }   
}
