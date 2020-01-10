package MyController;

import java.sql.*;

public class Postgres {
    Connection connection;
    public void connections() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trainingdb", "training", "chess123");
    }
    public void insert(Employee emp) throws SQLException {


        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO employee(firstName,lastName,dateOfBirth,experience) VALUES('"+emp.getFirstName()+"','"+emp.getLastName()+"','"+emp.getDateOfBirth()+"','"+emp.getExperience()+"')");
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
//        while(resultSet.next()){
//            System.out.println(resultSet);
//        }
    }
}
