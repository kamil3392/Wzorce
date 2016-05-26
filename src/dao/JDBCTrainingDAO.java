package dao;

import training.Sport;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JDBCTrainingDAO implements TrainingDAO {

    Connection connection = null;

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if(connection == null)
                connection = DriverManager.getConnection("jdbc:mysql://localhost/wzorce?user=root&password=");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return connection;
    }

    @Override
    public void insert(Sport sport) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO wzorce.sports (id ,name) VALUES (NULL , ?)");
            preparedStatement.setString(1,  sport.getName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public List<Sport> select() {
        List<Sport> persons = new LinkedList<Sport>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM wzorce.sports");

            Sport sport = null;
            while(resultSet.next()){
                sport = new Sport();
                sport.setId(Integer.parseInt(resultSet.getString("id")));
                sport.setName(resultSet.getString("name"));

                persons.add(sport);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(persons);
        return persons;
    }


    public void closeConnection(){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            //do nothing
        }
    }


}
