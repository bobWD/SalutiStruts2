package fest.struts.action;

public class MexHandleAction {
	public String execute() throws Exception {

		// Qua la business logic
		
		System.out.println("nell'action");
		System.out.println("Creare e salvare il bean del messaggio");
		
		return "success";
	}
}
