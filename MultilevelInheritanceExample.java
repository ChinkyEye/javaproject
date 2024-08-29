class Company {
    void getTotalEmployee(){
        System.out.println("The total employee are 500");
    }
}
class CountryBranch extends Company{
    void getEmpInCountry()
    {
        System.out.println("The total employee in country are 300");
    }
}
class LocalBranch extends CountryBranch{
    void getLocalEmp(){
        System.out.println("The total employee in Local branch are 200");
    }
}
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        System.out.println("EXample of Multilevel Inheritance");
        LocalBranch lb = new LocalBranch();
        lb.getLocalEmp();
        lb.getEmpInCountry();
        lb.getTotalEmployee();
    }
}
