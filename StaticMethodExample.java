class Try {
    void demo10(){
        // System.out.println("demo10 wala");
        jack();
    }
    static void jack(){
        System.out.println("this is jack");
    }    
}
public class StaticMethodExample {
    public static void main(String[] args) {
        System.out.println("Example of Static Method");
        Try tr = new Try();
        // tr.jack();
        tr.demo10();
    }
}
