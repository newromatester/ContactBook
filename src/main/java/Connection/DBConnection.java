package Connection;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import ru.qatools.properties.PropertyLoader;

import java.sql.*;

public class DBConnection {

    private Connection connection;

    public DBConnection() {
        PropertyManager property = PropertyLoader.newInstance()
                .populate(PropertyManager.class);
        try {
            connection = DriverManager.getConnection(property.getHost(), property.getUser(), property.getPassword());
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            if(!connection.isClosed()){
                System.out.println("Соединение установленно");
            }
        } catch (SQLException ex){
            System.err.println("Что-то пошло не так: \n");
            ex.printStackTrace();
        }
    }

    public Statement getConnection() throws SQLException{
        return connection.createStatement();
    }

}
