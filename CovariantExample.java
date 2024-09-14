class User12 
{
    User12 Ji_class()
    {
        System.out.println("hello i am milan khimding");
        return this;
    }
}
class Client2 extends User12{
    
    Client2 ji_class()
    {
        System.out.println("hello");
        return this;
    }
}
public class CovariantExample {
    public static void main(String[] args) {
        Client2 cl = new Client2();
        cl.Ji_class();

    }
}
