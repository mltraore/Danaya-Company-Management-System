package DA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Dataccess {
			private Connection con = null;
			private Statement  st  = null;		
			
		 	private static Dataccess dataccess = null;	 	
		 	
		 	public static Dataccess getDataccess() throws Exception {
		 		synchronized (Dataccess.class) {
		 			return dataccess= new Dataccess();
				}	
		 	}
		 	
			private Dataccess() throws Exception
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection("jdbc:sqlserver://EKBER\\MSSQLSERVER01;databaseName=DanayaDB;integratedSecurity=true");
				st = con.createStatement();
			}
			
			public ResultSet ExecuteQuery(String sql) throws Exception
			{	
				return st.executeQuery(sql);
			}
			
			public int ExecuteUpdate(String sql) throws Exception
			{
				return st.executeUpdate(sql);
			}			
}