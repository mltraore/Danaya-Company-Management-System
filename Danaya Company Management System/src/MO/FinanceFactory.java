package MO;

public class FinanceFactory implements AbstractFactory<Finances> {
   public Finances create(String type) {
	   if(type.equalsIgnoreCase("chiefAccount"))
		   return new ChiefAccount();
	   else if(type.equalsIgnoreCase("Accountant"))
		   return new Accountant();
	   else if(type.equalsIgnoreCase("SecretaryFinances"))
		   return new SecretaryFinances();
	   else
		   return null;
   }
}
