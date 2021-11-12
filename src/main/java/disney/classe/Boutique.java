package disney.classe;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Boutique {
	
	

	@OneToMany
	private List<Personnage> personnages = new ArrayList<Personnage>();
	
	private int vies; 
	
	private int nbEtoile;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Version
	private int version;
	
	
	
	
	
	
	
	
	
}
