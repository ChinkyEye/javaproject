public class another_operation {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;

        // comparision operation
        System.out.println(a == b); 
        System.out.println(a != b); 
        System.out.println(a >= b); 
        System.out.println(a <= b);
        // end of comparision operation
        
        // assignment operaion
        // a = a+b;
        // System.out.println(a);
        // a += b;
        // System.out.println(a);
        // a -= 18;
        // System.out.println(a);
        // end of assigment operation

        //logical operation
        System.out.println(a == b && a == c);
        System.out.println(a == b || a == c );
        System.out.println(!(a == b || a == c ));


    }
}
