package MO;

import java.sql.ResultSet;

import DA.Dataccess;

public class General   {
  
	
	public ResultSet ShowProfile(int id) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "select *from general where  tc = " + id;
		return  da.ExecuteQuery(query);

	}
	public ResultSet ShowProfiles() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from general ";
		return da.ExecuteQuery(sql);
		
	};
	public ResultSet SearchByName(String Name) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String query = "select *fom general where name=" + Name;
		return  da.ExecuteQuery(query);
	
	}

   public ResultSet sum() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="Select SUM(salary) from VWI_Calisan_Maasi_Zam_YOK";
		return da.ExecuteQuery(sql);
		
	};
	
	public ResultSet ShowAll() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from VWI_Calisan ";
		return da.ExecuteQuery(sql);
		
	};
	
	
	
public ResultSet SalaryNormal() throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql="select *from VWI_Calisan_Maasi_Zam_YOK ";
		return da.ExecuteQuery(sql);
		
	};
	
	
   public ResultSet ShowByPost(String postName) throws Exception{
		
		Dataccess da = Dataccess.getDataccess();
		String sql= "Exec "+postName;
		return da.ExecuteQuery(sql);
		
	};
	
	
	
	   public ResultSet Raise() throws Exception{
			
			Dataccess da = Dataccess.getDataccess();
			String sql= "SELECT name as 'name' ,surname as 'surname' "
					+ ", department as 'department' , post as 'post' , "
					+ "(salary+salary*0.15) as 'salary' FROM VWI_Calisan_Maasi_Zam_YOK";
			
			return da.ExecuteQuery(sql);
			
		};
		
		
	
	
	
	
	
	
	
	
	
	   private int  tc;
	   private String name;
	   private String surname; 
	   private String gender;
	   private String post;
	   private String department;
	   private String cell;
	   private String email;
	   private String password;
	   private String startDate;
	   private float  salary ;
	   
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStartingDate() {
		return startDate;
	}
	public void setStartingDate(String startingDate) {
		this.startDate = startingDate;
	}
	public String getDepartement() {
		return department;
	}
	public void setDepartement(String departement) {
		this.department = departement;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
}


