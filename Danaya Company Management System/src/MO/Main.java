package MO;
import java.awt.Component;
import java.awt.geom.GeneralPath;

import DA.Dataccess;

public class Main {

	public static void main(String[] args) throws Exception {

		Dataccess da = Dataccess.getDataccess();
		//String sql = "insert into [mm](name) values('Mohamed')";
		//da.ExecuteUpdate(sql);
		
		/*InformationProcessor info = new InformationProcessor();
		
		info.setTc(21);            
		info.setName("ee");      
		info.setSurname("ee");   
		info.setGender("ee");    
		info.setPost("ee");
		info.setDepartement("ee");
		info.setCell("ee");
	    info.setEmail("yy");
	    info.setPassword("ee");
	    info.setSalary(200);	
		
		
		info.getTc();            
		info.getName();      
		info.getSurname();   
		info.getGender();    
		info.getPost();
		info.getDepartement();
		info.getCell();
	    info.getEmail();
	    info.getPassword();
	    info.getSalary();    
	    info.Record(info);*/
	    
	    
	    ManagerFactory managerFactory = new ManagerFactory();
		Managers manager = managerFactory.getManager("GeneralManager");
		
		
	    
	    
  }
}