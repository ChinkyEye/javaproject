class Client {
    void getLogin(){
        System.out.println("client is logged in");
    }
}
class Seller extends Client{
    void getLogin(String name)
    {
        System.out.println("seller is logged in "+name);
    }
}
public class OverloadingWithInheritance {
    public static void main(String[] args) {
        Seller sel = new Seller();
        sel.getLogin("Milan");
    }
}
