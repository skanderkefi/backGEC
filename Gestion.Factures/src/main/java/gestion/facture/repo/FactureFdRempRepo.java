package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.facture.models.FactureFdRemb;

@Repository
public interface FactureFdRempRepo extends JpaRepository<FactureFdRemb, Long>{

}
