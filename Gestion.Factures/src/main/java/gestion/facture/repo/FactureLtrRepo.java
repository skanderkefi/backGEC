package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.facture.models.FactureLettreCredit;

@Repository
public interface FactureLtrRepo extends JpaRepository<FactureLettreCredit, Long>{

}
