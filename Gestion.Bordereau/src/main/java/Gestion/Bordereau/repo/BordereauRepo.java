package Gestion.Bordereau.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Gestion.Bordereau.model.Bordereau;

@Repository
public interface BordereauRepo extends JpaRepository<Bordereau, Long>{
	Bordereau findByReference(String ref);
}
