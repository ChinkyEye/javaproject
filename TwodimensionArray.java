public class TwodimensionArray {
    public static void main(String[] args) {
        String str[][] = new String[3][3];
        str[0][0]= "A";
        str[0][1]= "B";
        str[0][2]= "c";
        str[1][0]= "D";
        str[1][1]= "E";
        str[1][2]= "F";
        str[2][0]= "G";
        str[2][1]= "H";
        str[2][2]= "I";

        for(int i = 0; i<str.length;i++)
        {
            for(int j = 0; j <str[i].length;j++)
            {
                System.out.println(str[i][j]);
            }
        }
    }
}
