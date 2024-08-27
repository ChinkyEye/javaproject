class College {
    class Student {
        void getStudentDetails()
        {
            System.out.println("Here is the details of students");
        }
    }


    void getDetails(){
        System.out.println("Detail of students");
        Student st = new Student();
        st.getStudentDetails();
    }
}
public class NestedClassExample {
    public static void main(String[] args) {
        College col = new College();
        col.getDetails();
    }
}
