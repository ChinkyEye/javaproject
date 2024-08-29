class Parent_class {
    void getData(){
        System.out.println("This is parent class");
    }
}
class Child_class extends Parent_class {
    
}
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("Example of Inheritance in Java.");
        // Parent_class pcl = new Parent_class();
        // pcl.getData();
        Child_class c_cls = new Child_class();
        c_cls.getData();

    }
}
