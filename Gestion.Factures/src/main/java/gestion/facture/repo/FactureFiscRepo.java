package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.facture.models.FactureFiscalit√©;

@Repository
public interface FactureFiscRepo extends JpaRepository<FactureFiscalit√©, Long>{

}
