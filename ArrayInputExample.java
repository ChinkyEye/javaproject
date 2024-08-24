import java.util.Scanner;
public class ArrayInputExample {
    public static void main(String[] args) {
        System.out.println("Enter value of total element of array:");
        Scanner scan = new Scanner(System.in);
        int totalInput = scan.nextInt();
        int inputarray[] = new int[totalInput];
        System.out.println("Please enter the element of array:");
        for(int i = 0;i< totalInput;i++)
        {
            inputarray[i] = scan.nextInt(); 
        }
        System.out.println("Array Element are here");
        for(int i =0;i <totalInput;i++)
        {
            System.out.println(inputarray[i]);
        }
        
    }
}
