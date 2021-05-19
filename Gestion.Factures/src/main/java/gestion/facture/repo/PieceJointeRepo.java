package gestion.facture.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.facture.models.PieceJointe;

public interface PieceJointeRepo extends JpaRepository<PieceJointe, Long>{

}
