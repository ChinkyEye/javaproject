class Address {
    String city;
    String country;

    public Address(String city, String country)
    {
        this.city = city;
        this.country = country;
    }
}
class Employee {
    String name;
    // String city;
    // String country;
    Address adress1;

    public Employee(String name,Address ad)
    {
        this.name = name;
        this.adress1 =ad;
        // this.city = city;
        // this.country = country;
    }
    public void getDetails()
    {
        System.out.println(this.name);
        System.out.println(adress1.country +" "+ adress1.city);
    }
}
public class AggregationExample {
    public static void main(String[] args) {
        Address add = new Address("Kerabari", "Nepal");
        Employee emp = new Employee("milan",add);
        emp.getDetails();
    }
}
