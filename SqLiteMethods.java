package SQLitedB;

import java.sql.*;

public class SqLiteMethods {

    //Connecting to database
    public static void connect() {
        Connection conn = null;
        try {
            //db parameters
            String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";//Lint to dB
            //Create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to dB has been established");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Connection not successful");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    //Creating a new Database
    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:C:/sqlite/db/" + fileName;
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No Database Created");
        }
    }

    //Creating New Table for the Database
    public static void createNewTable() {
        String url = "jdbc:sqlite:C:/sqlite/db/[databasename]";
        String sql = "CREATE TABLE IF NOT EXISTS warehouse(\n"
                + " id integer PRIMARY KEY,\n"
                + " name text NOT NULL,\n"
                + " capacity real\n"
                + ");";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();{
            //Create a new table
            stmt.execute(sql);
        }
        }catch(
            SQLException e)
            {
             System.out.println(e.getMessage());
             System.out.println("Table was not created");
            }
         }

    private Connection connectOnly(){
        //SQLite Connection string
        String url = "jdbc:sqlite:C:/sqlite/db/[databasename]";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn; //return connection
    }

    public void selectQuery(){
        String sql = "SELECT * FROM warehouse";
        try {
            Connection conn = this.connectOnly();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //loop through the results set
            while (rs.next()){
                System.out.println(rs.getInt("id")+ "\t" + rs.getString("name") + "\t"+
                rs.getDouble("capacity"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Invalid Query");
        }
    }

    //Querying with Parameter
    public void getCapacityGreaterThan(double capacity){
        String sql = "SELECT id, name, capacity FROM warehouse WHERE capacity > ?";
        try{
            Connection conn = this.connectOnly();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            // Set the value
            pstmt.setDouble(1,capacity);
            ResultSet rs =pstmt.executeQuery();

            //Loop through the result set
            while (rs.next()){
                System.out.println(rs.getInt("id")+ "\t" + rs.getString("name") + "\t"+
                rs.getDouble("capacity"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    //Inserting data into table
    public void insertData(String name, double capacity){
        String sql = "INSERT INTO warehouse(name,capacity) VALUES(?,?)";
        try{
            Connection conn = this.connectOnly();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate();
            System.out.println("Data successfully added");
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Issue inserting the data");
        }
    }

    //Updating the table
    public void update(int id, String name, double capacity){
        String sql = "UPDATE warehouse SET name = ? , capacity= ? capacity = ? WHERE id = ?";
        try {
            Connection conn = this.connectOnly();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            //Set the corresponding parameters
            pstmt.setString(1, name);
            pstmt.setDouble(2, capacity);
            pstmt.setInt(3, id);
            pstmt.executeUpdate(); //Update
            System.out.println("Table Updated Successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());

        }
    }

    //Deleting
    public void delete(int id){
        String sql = "DELETE FROM warehouse WHERE id = ?";
        try{
            Connection conn = this.connectOnly();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //set the corresponding parameter
            pstmt.setInt(1, id);
            //Execute the delete statement
            pstmt.executeUpdate();
            System.out.println("Deleted successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Delete was unsuccessfully");
        }
    }


    public static void main(String[] args){
        //connect();
        createNewDatabase("test.db");
        createNewTable();
        SqLiteMethods app = new SqLiteMethods();
        app.selectQuery();
        app.getCapacityGreaterThan(500);
        app.insertData("Raw Materials", 3000);
        app.insertData("Finished Goods", 5000);
        //Updating the warehouse with id 3
        app.update(3, "Finished Products", 5500);
        //deleting the row with id 3
        app.delete(3);
    }
}
