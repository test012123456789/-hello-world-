
package driver123;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import javax.sql.RowSetMetaData;
import java.sql.*;
import java.util.jar.JarEntry;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Driver;

public class DBWindowAuthentication{
	
	private static final Driver Driver = null;
	public Connection conn = null;
	String query = null;
	//private String dbName = null;
	ResultSet rs = null;
	private Connection connection;
	
	public DBWindowAuthentication(String dbName, String dataSourceName) throws SQLException, InstantiationException, IllegalAccessException{
	//	this.dbName = dbName;
		try{
	    	Class drvClass=Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	DriverManager.registerDriver(Driver);
	        drvClass.newInstance();
	    		
			String dataSourceName1 = "SQL_New";
		      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		      
	//Driver conn = (Driver) DriverManager.getDrivers();
		      
	       this.connection = DriverManager.getConnection(dataSourceName1);
		      System.out.println("Connected Successfully"); 
		      query = "SELECT TOP 1000 [SLICE],[ROW_ID],[GROUP_NAME],[GROUP_DESCRIPTION],[GROUP_TYPE],[GROUP_SUBTYPE],[GROUP_MASK],[REL_STATE],[GROUP_REFRESH],[EXCLUDE_FROM_SURVEYS],[CAN_VIEW_ORGANIZATION_TICKETS],[GROUP_PHONE],[GROUP_EMAIL],[NEXT_ESCALATION_GROUP_ID] FROM [platform_esd_app_db_999999].[dbo].[IC_GROUPS];";
		      PreparedStatement ps = connection.prepareStatement(query);
		      rs = ps.executeQuery();
		      List<String> data = new ArrayList();
		      while(rs.next())
		      {
		      System.out.println(data.add(rs.getString(1)));
		      
		      }
		     }

		catch(ClassNotFoundException e){
		e.printStackTrace();
		}
}
public static void main(String[] args)
{
try{
DBWindowAuthentication db = new DBWindowAuthentication("SQLEXPRESS", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
}
catch(Exception e){
e.printStackTrace();
}
}

}