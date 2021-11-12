package disney.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import disney.classe.Carte;
import disney.classe.Cases;

public interface IPlateauRepo extends JpaRepository<Cases,Long> {

}
