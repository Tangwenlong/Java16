package com.accp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class DbHelper {
	private static String DRIVER_CLASS="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/shangping";
	private static String URSE="root";
	private static String PASSWORD="12345";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS);
		return DriverManager.getConnection(URL,URSE,PASSWORD);
	}
	
	public static <T> List<T> Query(Class<T> clazz,String sql,Object...params){
		Connection connection = null;
		try {
			connection = getConnection();
			QueryRunner query = new QueryRunner();
			return query.query(connection, sql, new BeanListHandler<T>(clazz), params);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
		
	}
	
	
	public static int update(String sql,Object...params) {
		Connection connection = null;
		try {
			connection = getConnection();
			QueryRunner query = new QueryRunner();
			return query.update(connection, sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	
}
