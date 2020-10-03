package MO;

public class SecurityFactory implements AbstractFactory<Security>{
    public Security create(String type) {
    	if(type.equalsIgnoreCase("SecurityAgent"))
    		return new SecurityAgent();
    	else if(type.equalsIgnoreCase("Guardian"))
    		return new Guardian();
    	else
    		return null;
    }
}
