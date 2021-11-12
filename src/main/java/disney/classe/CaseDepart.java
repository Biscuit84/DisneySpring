package disney.classe;

import javax.persistence.Entity;

@Entity
public class CaseDepart extends Cases{

	
	
	
	public CaseDepart() {
		super();
	
	}

	public CaseDepart( String nom) {
		super(nom);
		
	}

	@Override
	public void effetCase() {
		
		
	}

}
