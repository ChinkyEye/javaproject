public class StringExample {
    public static void main(String[] args) {
        // String  str = "Hi My name is MIlan Khimding";
        String  str = " ";
        System.out.println(str);
        // System.out.println(str.substring(4));
        // System.out.println(str.substring(4,5));
        // System.out.println(str.replace("Hi", "Hello"));
        System.out.println(str.length());
        System.out.println(str.isEmpty());

        char[] chArray = {'A','B','C'};
        String str1 = new String(chArray);
        System.out.println(chArray);
        System.out.println(str1);
    }
}
