package disney.classe;

import java.util.Random;

import javax.persistence.Entity;

@Entity
public class CaseDeplacement extends Cases {

	
	
	
	
	public CaseDeplacement() {
		super();
	
	}

	public CaseDeplacement( String nom) {
		super( nom);
		
	}

	@Override
	public void effetCase() {
//	//  tirage d'un chiffre al?atoire entre -3 et -1, sans 0
//	// avance ou recule 
//		
//		int number =0;
//		while (number==0) {
//			Random r = new Random();
//			number = r.nextInt(7 - 0) - 3;
//		}
		
		
		
	}

}
