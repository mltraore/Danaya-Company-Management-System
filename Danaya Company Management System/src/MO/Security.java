package MO;

import java.sql.ResultSet;

public interface Security<T> {
  
	public void Record(T c) throws Exception;
	public int  Update(T c) throws Exception;	
	public int  Delete(int id) throws  Exception;
	public ResultSet ShowProfile(int id) throws Exception;
	public ResultSet ShowProfiles() throws Exception;
	public ResultSet SearchByName(String name) throws Exception;
	public Boolean Login(T c) throws Exception;
	
}
