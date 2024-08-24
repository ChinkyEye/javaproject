public class BreakandContinue {
    public static void main(String[] args) {
        System.out.println("Break and Continue");
        int a;
        for(a=1;a<10;a++){
            if (a == 5) {
                break;
            }
            System.out.println(a);
        }
        System.out.println("Example of continue");
        for(int b =1;b<10;b++){
            if (b == 5) {
                continue;
            }
            System.out.println(b);
        }
    }
}
