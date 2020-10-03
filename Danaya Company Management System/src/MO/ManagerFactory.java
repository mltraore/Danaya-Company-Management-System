package MO;

public class ManagerFactory {
   public Managers getManager(String managerType) {
	   if(managerType.equalsIgnoreCase("GeneralManager"))
		    return new GeneralManager();
	   else if(managerType.equalsIgnoreCase("ManagerAssistant"))
		   return new ManagerAssistant();
	   else if(managerType.equalsIgnoreCase("SalesManager"))
		   return new SalesManager();
	   else if(managerType.equalsIgnoreCase("HumanResourcesManager"))
		   return new HumanResourcesManager();
	   else
		   return null;
   }
	 
}
