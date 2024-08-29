interface ITServices {
    void getITServiceDetail();
}
interface HardwareServices {
    void getHardwareServiceDetail();

}
class Company1 implements ITServices,HardwareServices {
    public void getITServiceDetail()
    {
        System.out.println("Here is the detail of IT Services");
    }
    public void getHardwareServiceDetail()
    {
        System.out.println("Here is the imformation about Hardware services of company");
    }
}
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Company1 cm = new Company1();
        cm.getITServiceDetail();
        cm.getHardwareServiceDetail();
    }
}
