class Demo2 {
  static int counter = 0;
  void getcounter(){
    counter++;
    System.out.println(counter);
  }  
}
public class StaticExample {
    public static void main(String[] args) {
        Demo2 per1 = new Demo2();
        Demo2 per2 = new Demo2();
        per1.getcounter();
        per2.getcounter();
    }
}
