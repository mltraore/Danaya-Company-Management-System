package MO;

import java.sql.ResultSet;

public abstract class Managers<T>  {
	
	public void Record(T c) throws Exception{};
	public int  Update(T c) throws Exception{
		return 0;
	};	
	public int  Delete(int id) throws  Exception{
		return 0;
	};
	public ResultSet ShowProfile(int id) throws Exception{
		return null;
	};
	public ResultSet ShowProfiles() throws Exception{
		return null;
	};
	public ResultSet SearchByName(String name) throws Exception{
		return null;
	};
	public Boolean Login(T c) throws Exception{
		return false;
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
