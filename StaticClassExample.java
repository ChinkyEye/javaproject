class School {
    static String name = "MIlan";
    static class Teacher {
        void getTeacherDetails()
        {
            // System.out.println("Here is the details of teachers");
            System.out.println(name);
        }
    }
}
public class StaticClassExample {
    public static void main(String[] args) {
        School.Teacher tchr = new School.Teacher();
        tchr.getTeacherDetails();
    }
}
