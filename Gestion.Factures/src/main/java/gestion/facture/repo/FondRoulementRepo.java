package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.facture.models.FondRoulement;

public interface FondRoulementRepo extends JpaRepository<FondRoulement, Long>{

}
