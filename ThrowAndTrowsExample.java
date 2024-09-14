public class ThrowAndTrowsExample {
    public static void main(String[] args) {
        // try {
        //     int a = 10;
        //     System.out.println(a/10);
        //     if(a == 10){
        //         throw new ArithmeticException("test"); 
        //     }
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        try {
          checkAge();
        } catch (Exception e) {
            System.out.println("Some exceptions"+ e);
        }
    }
    public static void checkAge() throws ArithmeticException
    {
        System.out.println(10/0);
    }
}
