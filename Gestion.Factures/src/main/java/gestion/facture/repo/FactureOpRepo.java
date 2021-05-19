package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.facture.models.FactureOperateur;

@Repository
public interface FactureOpRepo extends JpaRepository<FactureOperateur, Long>{

}
