package MO;

import java.sql.ResultSet;

import DA.Dataccess;

public class ChiefAccountAudit extends  Audit<ChiefAccountAudit>{
	
	public void Record(ChiefAccountAudit c) throws Exception {
		Dataccess da = Dataccess.getDataccess();
		String query = "insert into chiefAccountAudit(tc,name,surname,gender,post,department,cell,email,password,startDate,salary)"
			       + "values('"+c.getTc()+"','"+c.getName()+"','"+c.getSurname()+"','"+c.getGender()+"','"+c.getPost()+"','"+c.getDepartement()+"','"+c.getCell()+"','"+c.getEmail()+"','"+c.getPassword()+"',"
			       + "GETDATE(),'"+c.getSalary()+"')";
	       da.ExecuteUpdate(query);
		
	}
	public int Update(ChiefAccountAudit c) throws Exception {
		
		return 0;
	}
	
public int  Delete(int id) throws  Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "delete from chiefAccountAudit where  id = " + id;
		return  da.ExecuteUpdate(query);
		
	};
	public ResultSet ShowProfile(int id) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from chiefAccountAudit where id =" + id;
		return da.ExecuteQuery(sql);
	};
	public ResultSet ShowProfiles() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from chiefAccountAudit";
		return da.ExecuteQuery(sql);
	};
	public ResultSet SearchByName(String name) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String search = "select *from chiefAccountAudit where name = " + name;
		return da.ExecuteQuery(search);
	};
	public Boolean Login(ChiefAccountAudit c) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "select id from chiefAccountAudit where email = '"+c.getEmail()+"' and password= '"+c.getPassword()+"'";
		return da.ExecuteQuery(query).next();
	}
	
}