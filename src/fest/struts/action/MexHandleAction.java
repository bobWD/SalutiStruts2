package fest.struts.action;

import fest.struts.model.MexStoreModel;

public class MexHandleAction {
	
	private MexStoreModel mexModel;
	
	public String execute() throws Exception {

		// Qua la business logic
		
		System.out.println("nell'action");
		
		mexModel = new MexStoreModel();
		mexModel.setMex("Ciao bel fiö!!!");
		
		return "success";
	}

	public MexStoreModel getMexModel() {
		return mexModel;
	}

	public void setMexModel(MexStoreModel mex) {
		this.mexModel = mex;
	}
}
