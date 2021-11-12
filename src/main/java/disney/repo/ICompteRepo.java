package disney.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import disney.classe.Compte;

public interface ICompteRepo extends JpaRepository<Compte,Long> {

}
