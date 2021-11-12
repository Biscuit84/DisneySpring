package disney.classe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class PersoObtenu {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Version
	private int version;
	
	@ManyToOne
	private Personnage perso;
	
	@ManyToOne
	private Joueur joueur;
	
	public PersoObtenu() {
	}

	public PersoObtenu(Personnage perso, Joueur joueur) {
		
		this.perso = perso;
		this.joueur = joueur;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Personnage getPerso() {
		return perso;
	}

	public void setPerso(Personnage perso) {
		this.perso = perso;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	@Override
	public String toString() {
		return "PersoObtenu [id=" + id + ", perso=" + perso + ", joueur=" + joueur + "]";
	}
	
	
	
}
