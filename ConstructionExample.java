class Person {
    String another_way;
    Person(String name){
        this.another_way = name;
        System.out.println(name);
    }

}
public class ConstructionExample {
    public static void main(String[] args) {
        System.out.println("Example of Constructor");
        String name = "Kapil";
        Person pers = new Person(name);
        System.out.println(pers.another_way);
    }
}
