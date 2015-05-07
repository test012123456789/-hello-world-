package driver123;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import javax.sql.RowSetMetaData;
import java.sql.*;
import java.util.jar.JarEntry;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Driver;
public class DBConnectivity{
	
	private static final Driver Driver = null;
	Connection connection = null;
	String query = null;
	PreparedStatement ps = null;
	Connection con = null;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  //  String url = "jdbc:sqlserver://.\\SQLEXPRESS;databaseName=platform_esd_app_db_999999; Integrated Security = SSPI ";
//String url = "jdbc:sqlserver://.\\SQLEXPRESS" + "localhost" + ":1433;databaseName=" + "platform_esd_app_db_999999";
String url = "jdbc:sqlserver://localhost:1433;DatabaseName=TestDatabase;integratedSecurity=true";

//"jdbc:sqlserver://(local):1433;DatabaseName=platform_esd_app_db_999999"
	    Connection con = null;
	    Statement stmt = null;

	    ResultSet rs = null;
	    try {
	    	Class drvClass=Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	//DriverManager.registerDriver(Driver);
	    		//drvClass.newInstance();	
	        con = DriverManager.getConnection(url);
	        String sql = "Select Top 3 from * person.Contact";
	        stmt = con.createStatement();
	        rs = stmt.executeQuery(sql);
	        while (rs.next()) {
	            System.out.println(rs.getString(1));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}