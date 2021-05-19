package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.facture.models.FactureComdist;

@Repository
public interface FactureComdistRepo extends JpaRepository<FactureComdist, Long>{

	FactureComdist findByNumFacture(String num);
}
