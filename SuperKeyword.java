class Someone {
    String name = "milan";
    void first_function()
    {
        System.out.println("this is from someone class");
    }
}
class Two extends Someone {
    void dosomething()
    {
        System.out.println("this is from two class");
        System.out.println(super.name);
        super.first_function();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Two tw = new Two();
        tw.dosomething();
    }
}
