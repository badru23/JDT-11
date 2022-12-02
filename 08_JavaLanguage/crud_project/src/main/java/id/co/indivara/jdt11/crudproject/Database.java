package id.co.indivara.jdt11.crudproject;
import java.sql.*;

public class Database{
	private Connection c;
	private String url="jdbc:mysql://localhost:3306/apidb";
	private String user="root";
	private String pass="";
	
	public Connection getConnection() throws Exception{
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		c=DriverManager.getConnection(url,user,pass);
		
		return c;
	}
	
}