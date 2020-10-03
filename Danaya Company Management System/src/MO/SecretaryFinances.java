package MO;

import java.sql.ResultSet;

import DA.Dataccess;

public class SecretaryFinances extends  Finances<SecretaryFinances> {

	@Override
	public void Record(SecretaryFinances c) throws Exception {
		// TODO Auto-generated method stub
		Dataccess da = Dataccess.getDataccess();
		String query = " insert into informationProcessor(tc,name,surname,gender,post,department,cell,email,password,startDate,salary)"
			       + "values('"+c.getTc()+"','"+c.getName()+"','"+c.getSurname()+"','"+c.getGender()+"','"+c.getPost()+"','"+c.getDepartement()+"','"+c.getCell()+"','"+c.getEmail()+"','"+c.getPassword()+"',"
			       + "GETDATE(),'"+c.getSalary()+"')";
	       da.ExecuteUpdate(query);
	}

	@Override
	public int Update(SecretaryFinances c) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
public int  Delete(int id) throws  Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "delete from secretaryFinances where  id = " + id;
		return  da.ExecuteUpdate(query);
		
	};
	public ResultSet ShowProfile(int id) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from secretaryFinances where id =" + id;
		return da.ExecuteQuery(sql);
	};
	public ResultSet ShowProfiles() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from secretaryFinances";
		return da.ExecuteQuery(sql);
	};
	public ResultSet SearchByName(String name) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String search = "select *from secretaryFinances where name = " + name;
		return da.ExecuteQuery(search);
	};
	public Boolean Login(SecretaryFinances c) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "select id from secretaryFinances where email = '"+c.getEmail()+"' and password= '"+c.getPassword()+"'";
		return da.ExecuteQuery(query).next();
	}	
}