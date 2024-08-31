abstract class android {
    void goodFeature(){
        System.out.println("Android has some good feature");
    }
    abstract void makeyourUI();
}
class AnySmartPhone extends android {
    void makeyourUI(){
        System.out.println("Smartphone has UI property");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        AnySmartPhone ay = new AnySmartPhone();
        ay.makeyourUI();
        ay.goodFeature();
    }
}
