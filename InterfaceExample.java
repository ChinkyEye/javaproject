interface Driving {
    void startEngine();
    String name = "milan";
}

class Car2 implements Driving {
    public void startEngine()
    {
        System.out.println("Car engine is start");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Car2 cr = new Car2();
        cr.startEngine();
        System.out.println(cr.name);
    }
}
