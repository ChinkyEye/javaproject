class UserClass {
    void login1()
    {
        System.out.println("User is login");
    }
}
class SubClass extends UserClass{
    void login1()
    {
        System.out.println("User logged in from subclass");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        SubClass uscls = new SubClass();
        uscls.login1();
    }
}
