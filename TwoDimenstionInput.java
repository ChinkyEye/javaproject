import java.util.Scanner;

public class TwoDimenstionInput {
    public static void main(String[] args) {
        int d1=3;
        int d2=3;
        String str[][] = new String[d1][d2];
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the element of array:");
        for(int i = 0;i<d1;i++)
        {
            for(int j=0;j<d2;j++)
            {
                str[i][j] = scan.next();
            }
        }

        System.out.println("The array is here:A");
        for(int i = 0; i<str.length;i++)
        {
            for(int j = 0; j <str[i].length;j++)
            {
                System.out.println(str[i][j]);
            }
        }
        
    }
}
