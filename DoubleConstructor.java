class Person1 {
    Person1(String name)
    {
        System.out.println(name);
    }
    Person1(){
        System.out.println("first construcotr");
    }
}
public class DoubleConstructor {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("Milan");
    }
}
