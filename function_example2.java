public class function_example2 {
    public static void main(String[] args) {
        int user_age = 20;
        System.out.println("Hello");
        getAgeByDate(user_age);
        int a = 2000;
        int t = 2;
        int r = 3;
        calculateInterestRate(a, t, r);
        int c = return_int();
        System.out.println(c);
        System.out.println(getName());

    }

    public static void getAgeByDate(int age)
    {
        System.out.println("Here you will find user age "+ age);
    }

    public static void calculateInterestRate(int amount, int time, int rate)
    {
        System.out.println("the total is : "+(amount*rate*time)/100 );
    }
    public static int return_int()
    {
        return 100;
    }
    public static String getName()
    {
        return "Milan";
    }
    
}
