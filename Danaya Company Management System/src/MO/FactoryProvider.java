package MO;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factory) {
    	if(factory.equalsIgnoreCase("AuditFactory"))
    		return new AuditFactory();
    	else if(factory.equalsIgnoreCase("FinanceFactory"))
    		return new FinanceFactory();
    	else if(factory.equalsIgnoreCase("SecurityFactory"))
    		return new SecurityFactory();
    	else
    		return null;
    }
}
