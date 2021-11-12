import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import disney.App.AppConfig;
import disney.classe.Admin;
import disney.classe.Cases;
import disney.classe.Joueur;
import disney.classe.Personnage;
import disney.classe.TypeCase;
import disney.repo.IAdminRepo;
import disney.repo.ICasesRepo;
import disney.repo.IJoueurRepo;
import disney.repo.IPersonnageRepo;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IJoueurRepo joueurRepo= spring.getBean(IJoueurRepo.class);
		IAdminRepo adminRepo= spring.getBean(IAdminRepo.class);
		IPersonnageRepo persoRepo= spring.getBean(IPersonnageRepo.class);
		ICasesRepo casesRepo= spring.getBean(ICasesRepo.class);
		
		Joueur joueur1 = new Joueur("joueur1", "1234", "Toto", "Titi", "toto.titi@gmail.com", "TotoTropFort", "noob", 3);
		
		joueur1=joueurRepo.save(joueur1);
		
		Admin admin1 = new Admin("admin1", "987654321", "admin1", "admin1","admin1@gmail.com");
		
		admin1=adminRepo.save(admin1);
		
		Personnage perso1 = new Personnage("Elsa", "Olaf", "Hans", "Glace");
		
		perso1=persoRepo.save(perso1);
		
		Cases caseMechant = new Cases("Mechant",TypeCase.mechant);
		caseMechant = casesRepo.save(caseMechant);
		
		spring.close();
		
	}

}
