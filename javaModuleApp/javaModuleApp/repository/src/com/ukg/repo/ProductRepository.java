package com.ukg.repo;

//error will come because by default only java.base module included in the
//project, java.sql is module which is available on demand
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductRepository {
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("");
    }
}
