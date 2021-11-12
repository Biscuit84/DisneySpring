package disney.classe;

import javax.persistence.Entity;

@Entity
public class CaseArrivee extends Cases {

	
	
	
	public CaseArrivee() {
		super();
		
	}

	public CaseArrivee(String nom) {
		super( nom);
		
	}

	@Override
	public void effetCase() {
		
		
	}

}
