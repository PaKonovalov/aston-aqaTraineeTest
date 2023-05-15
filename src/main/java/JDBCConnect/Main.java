package JDBCConnect; //Java Database Connectivity

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //TODO Создаем подключение к базе данных, видеоурок тут https://www.youtube.com/watch?v=_QXxTwJPG30
        String userName = "root";
        String password = "3003";
        String connectionUrl = "jdbc:mysql://localhost:3306/mysql";

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
            //System.out.println("Соединение успешно установленно");

        //TODO для возможности написания апросов sql из кода
        Statement statement = connection.createStatement()){

            //executeUpdate() - если нам нужно написать запрос, в ходе которого будут внесены
            //изменения базу данных
//            statement.executeUpdate("CREATE TABLE Products " +
//                    "(Id INT AUTO_INCREMENT PRIMARY KEY, " +
//                    "ProductName VARCHAR(30) NOT NULL," +
//                    " Manufacturer VARCHAR(20) NOT NULL, " +
//                    "ProductCount INT DEFAULT 0, " +
//                    "Price DECIMAL NOT NULL);");
//
//            добавим данные в таблицу
//            statement.executeUpdate("INSERT Products(ProductName, Manufacturer, ProductCount, Price) " +
//                                    "VALUES ('iPhone X', 'Apple', 5, 76000);");
//            System.out.println("Данные добавлены");

        //получим записи из таблицы
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Products");
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
        }
    }
}
