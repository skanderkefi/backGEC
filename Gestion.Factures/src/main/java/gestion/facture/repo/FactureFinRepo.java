package gestion.facture.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.facture.models.FactureFinancement;

@Repository
public interface FactureFinRepo extends JpaRepository<FactureFinancement, Long>{

}
