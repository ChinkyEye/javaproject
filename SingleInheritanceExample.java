class Engine {
    void start()
    {
        System.out.println("Engine Started");
    }
    private void repair_engine(){
        System.out.println("Engine is working fine now");
    }
}
class Car extends Engine {
    void start()
    {
        System.out.println("Engine Started from Child class");
    }
}
public class SingleInheritanceExample {
    public static void main(String[] args) {
        System.out.println("Example of Single Inheritance");
        Car cr = new Car();
        cr.start();
        // cr.repair_engine();
        
    }
}
