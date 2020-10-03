package MO;

public class AuditFactory implements AbstractFactory<Audit>{
   public Audit create(String type) {
	   if(type.equalsIgnoreCase("ChiefAccountAudit"))
		   return new ChiefAccountAudit();
	   else if(type.equalsIgnoreCase("ComissaryInControl"))
		   return new ComissaryInControl();
	   else if(type.equalsIgnoreCase("Secretary"))
		   return new SecretaryAudit();
	   else
		   return null;	   
   }
}
