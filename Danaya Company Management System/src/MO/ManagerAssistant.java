package MO;

import java.sql.ResultSet;

import DA.Dataccess;

public class ManagerAssistant  extends Managers<ManagerAssistant> {

	
	public void Record(ManagerAssistant c) throws Exception {
		Dataccess da = Dataccess.getDataccess();
		String query = " insert into managerAssistant(tc,name,surname,gender,post,department,cell,email,password,startDate,salary)"
			       + "values('"+c.getTc()+"','"+c.getName()+"','"+c.getSurname()+"','"+c.getGender()+"','"+c.getPost()+"','"+c.getDepartement()+"','"+c.getCell()+"','"+c.getEmail()+"','"+c.getPassword()+"',"
			       + "GETDATE(),'"+c.getSalary()+"')";
	      da.ExecuteUpdate(query);	
	}

	
	public int Update(ManagerAssistant c) throws Exception {
		Dataccess da = Dataccess.getDataccess();
		String query = " update  accountant set name = '"+c.getName()+"',surname = '"+c.getSurname()+"',gender='"+c.getGender()+"',post='"+c.getPost()+"',department='"+c.getDepartement()+"',"
				+" cell='"+c.getCell()+"',email='"+c.getEmail()+"',password='"+c.getPassword()+"',startDate=GETDATE(),salary='"+c.getSalary()+"' where tc = " +c.getTc();
				return da.ExecuteUpdate(query);
	}

	
	public int Delete(int id) throws Exception {
	
		Dataccess da = Dataccess.getDataccess();
		String query = "delete from managerAssistant where  tc = " + id;
		return  da.ExecuteUpdate(query);
		
	}

	
	public ResultSet ShowProfile(int id) throws Exception {
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from managerAssistant where id =" + id;
		return da.ExecuteQuery(sql);
	}

	
	public ResultSet ShowProfiles() throws Exception {
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from managerAssistant";
		return da.ExecuteQuery(sql);
		
	}

	
	public ResultSet SearchByName(String name) throws Exception {
		
		Dataccess da = Dataccess.getDataccess();
		String search = "select *from managerAssistant where name = " + name;
		return da.ExecuteQuery(search);
	}


	public Boolean Login(ManagerAssistant c) throws Exception {
		
		Dataccess da = Dataccess.getDataccess();
		String query = "select id from managerAssistant where email = '"+c.getEmail()+"' and password= '"+c.getPassword()+"'";
		return da.ExecuteQuery(query).next();
	}

}
