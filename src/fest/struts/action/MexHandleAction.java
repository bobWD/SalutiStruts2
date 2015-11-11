package fest.struts.action;

import fest.struts.model.MexStoreModel;

public class MexHandleAction {
	
	private MexStoreModel mexModel;
	private String tipo;		// questo lo prende dai parametri passati dalla pagina col GET (probabilmente anche col POST... da testare)
	
	public String execute() throws Exception {

		System.out.println("nell'action: tipo = " + tipo);		// TODO: sostituire questo col log4j
		
		mexModel = new MexStoreModel();
		
		
		if(tipo==null)
			mexModel.setMex("Ciao Ulisse ;)");
		else if(tipo.equals("cortese"))
			mexModel.setMex("Buongiorno.");
		else if(tipo.equals("cordiale"))
			mexModel.setMex("Ciao!");
		else if(tipo.equals("locale"))
			mexModel.setMex("Ciao bel fiö!!!");
		
		return "success";
	}

	public MexStoreModel getMexModel() {
		return mexModel;
	}

	public void setMexModel(MexStoreModel mex) {
		this.mexModel = mex;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
