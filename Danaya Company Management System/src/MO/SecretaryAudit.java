package MO;

import java.sql.ResultSet;

import DA.Dataccess;

public class SecretaryAudit extends  Audit<SecretaryAudit>{


	public void Record(SecretaryAudit c) throws Exception {
		
		
	}


	public int Update(SecretaryAudit c) throws Exception {
		
		return 0;
	}


	public int  Delete(int id) throws  Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "delete from secretaryAudit where  id = " + id;
		return  da.ExecuteUpdate(query);
		
	};
	public ResultSet ShowProfile(int id) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from secretaryAudit where id =" + id;
		return da.ExecuteQuery(sql);
	};
	public ResultSet ShowProfiles() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from secretaryAudit";
		return da.ExecuteQuery(sql);
	};
	public ResultSet SearchByName(String name) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String search = "select *from secretaryAudit where name = " + name;
		return da.ExecuteQuery(search);
	};
	public Boolean Login(SecretaryAudit c) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "select id from secretaryAudit where email = '"+c.getEmail()+"' and password= '"+c.getPassword()+"'";
		return da.ExecuteQuery(query).next();
	}
	
}
