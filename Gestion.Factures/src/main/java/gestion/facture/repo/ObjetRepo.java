package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.facture.models.Objet;

public interface ObjetRepo extends JpaRepository<Objet, Long>{

}
