class This_class {
    static String name = "Milan";
    This_class() {
        System.out.println("Details of this class");
    }
    void getName(){
        System.out.println(this.name);
    }
}
public class ThisExample {
    public static void main(String[] args) {
        System.out.println("Example of This keyword");
        This_class this_c = new This_class();
        this_c.getName();
    }
}
