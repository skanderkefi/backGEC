package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import gestion.facture.models.Facture3wm;

@Repository
public interface Facture3wmRepo extends JpaRepository<Facture3wm, Long>{

}
