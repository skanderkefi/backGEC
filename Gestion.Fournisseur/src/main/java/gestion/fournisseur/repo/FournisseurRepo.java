package gestion.fournisseur.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.fournisseur.model.Fournisseur;

@Repository
public interface FournisseurRepo extends JpaRepository<Fournisseur, Long>{
	
	Fournisseur findByNumPo(Long id) ;
	

}
