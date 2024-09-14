import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionExample {
    public static void main(String[] args) {
        // getConnection();
        // getData();
        // insertData();
        // deleteData();
        // updateData();
        getFilter();
    }

    public static Connection getConnection()
    {
        // Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/javadatabase";
            String username = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl, username, password);
            System.out.println("Database is connected");
            return conn;
        } catch (Exception e) {
            System.out.println("some error");
        }
        // return connection;
        return null;

    }

    public static void getData()
    {
        try {
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from student");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("address"));
            }
            
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    public static void insertData()
    {
        try {
            Statement statement = getConnection().createStatement();
            int resultSet = statement.executeUpdate("Insert into student (id,name,address,email) Values(4,'kapil','Kerabari','kapil@gmail.com')");
            if (resultSet ==1) {
                System.out.println("Data inserted succesfully");
            }
            else{
                System.out.println("Unsuccessful");
            }
        } catch (Exception e) {
            System.out.println("Eror"+ e);
        }
    }

    public static void deleteData()
    {
        try {
            Statement statement = getConnection().createStatement();
            int resultSet = statement.executeUpdate("Delete from student where id = 4");
            if (resultSet == 1) {
                System.out.println("Data deleted successfully");
            }else{
                System.out.println("Could not delete");
            }
            
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }

    public static void updateData()
    {
        try {
            Statement statement = getConnection().createStatement();
            int resultSet = statement.executeUpdate("Update student set name= 'Laxmi Ghimimre',email = 'ghimire@gmail.com' where id = 3 ");
            if (resultSet == 1) {
                System.out.println("Data updated successfully");
            }
            else{
                System.out.println("Could not update");
            }
        } catch (Exception e) {
            System.out.println("error"+ e);
        }
    }

    public static void getFilter()
    {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the id value:");
            int id  = scan.nextInt();
            // System.out.println(id);
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from student where id ="+id);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("address"));
            }
        } catch (Exception e) {
            System.out.println("error"+ e);
        }
    }
}
