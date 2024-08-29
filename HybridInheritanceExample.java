interface ITServces1 {
    void getITServicesDetail();
}
interface HardwareServices1 {
    void getHardwareServices();
}
class BaseCompany implements ITServces1,HardwareServices1 {
    void getBaseCompanyDetail()
    {
        System.out.println("Detail of base company");
    }
    public void getITServicesDetail()
    {
        System.out.println("Here is the detail of IT services");
    }
    public void getHardwareServices()
    {
        System.out.println("Here is the detail of hardware services");
    }
}
class ChildCompany extends BaseCompany {

}
class LocalCompany extends ChildCompany {

}
class SharedCompany extends BaseCompany {

}
public class HybridInheritanceExample {
    public static void main(String[] args) {
        LocalCompany local_c = new LocalCompany();
        SharedCompany sc = new SharedCompany();
        sc.getBaseCompanyDetail();
        local_c.getBaseCompanyDetail();
        sc.getITServicesDetail();
        sc.getHardwareServices();
    }
}
