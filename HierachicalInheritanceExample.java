class User {
    void login()
    {
        System.out.println("User is login");
    }
}
class Student extends User {
    
}
class Teacher extends User {

}
public class HierachicalInheritanceExample {
    public static void main(String[] args) {
     Student st = new Student();
     Teacher tr = new Teacher();
     st.login();   
     tr.login();   
    }
}
