package gestion.facture.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facture_operateur")
public class FactureOperateur extends Facture{

	private String structure;
	private String fournisseur;
	private Date dateOp;
	private Timestamp createdAt, UpdatedAt;
	private String dossier;
	private int direction;
	private String ordrep;
	
	  

	public FactureOperateur(Long id,String f, int bordereau, String devise, double montant, String objet, String num_po,
			String status, String factname, String pathpdf, Date datereception, String created_by, String structure,
			String fournisseur, Date dateOp, Timestamp createdAt,Timestamp UpdatedAt, String ordrep,String pieceJointe
			, String dateEnvoieAuAp, String dateRefusParAp,String datValidationParAp,String dateRefusParTreso,
			String dateValidationParTreso, String raisonRefusAp, String codeAp,String toAp,
			String codeTreso, String raisonRefusTreso) {
		super(id, fournisseur, bordereau, devise, montant, objet, num_po, status, factname, pathpdf, datereception,
				created_by, pieceJointe, dateEnvoieAuAp, dateRefusParAp, datValidationParAp, dateRefusParTreso, 
				dateValidationParTreso, raisonRefusAp, codeAp, toAp,codeTreso, raisonRefusTreso);
		
		
		this.structure = structure;
		this.fournisseur = fournisseur;
		this.dateOp = dateOp;
		this.ordrep=ordrep;
	}
	
	public FactureOperateur(long id) {
		this.id=id;
	}
	
	public FactureOperateur() {
		
	}

	        @Id
			@Column(name = "id")
			@GeneratedValue(strategy = GenerationType.AUTO)
			public Long getId() {
				return id;
			}
		    
		    public void setId(Long id) {
				this.id = id;
			}

       
	@Column(name = "bordereau")
	public int getBordereau() {
		return bordereau;
	}


	public void setBordereau(int bordereau) {
		this.bordereau = bordereau;
	}
	
	@Column(name = "pieceJointe")
	public String getPieceJointe() {
		return pieceJointe;
	}


	public void setPieceJointe(String pieceJointe) {
		this.pieceJointe = pieceJointe;
	} 

	@Column(name = "fournisseur")
	public String getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	@Column(name = "structure")
	public String getStructure() {
		return structure;
	}


	public void setStructure(String structure) {
		this.structure = structure;
	}

	

	@Column(name = "devise")
	public String getDevise() {
		return devise;
	}


	public void setDevise(String devise) {
		this.devise = devise;
	}

	@Column(name = "montant")
	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Column(name = "objet")
	public String getObjet() {
		return objet;
	}


	public void setObjet(String objet) {
		this.objet = objet;
	}

	@Column(name = "num_po")
	public String getNum_po() {
		return num_po;
	}


	public void setNum_po(String num_po) {
		this.num_po = num_po;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "factname")
	public String getFactname() {
		return factname;
	}


	public void setFactname(String factname) {
		this.factname = factname;
	}

	@Column(name = "pathpdf")
	public String getPathname() {
		return pathpdf;
	}


	public void setPathname(String pathname) {
		this.pathpdf = pathname;
	}

	@Column(name = "datereception")
	public Date getDatereception() {
		return datereception;
	}


	public void setDatereception(Date datereception) {
		this.datereception = datereception;
	}

	@Column(name = "created_by")
	public String getCreated_by() {
		return created_by;
	}


	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	@Column(name = "dateop")
	public Date getDateOp() {
		return dateOp;
	}

	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}
	@Column(name = "created_at")
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "updated_at")
	public Timestamp getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		UpdatedAt = updatedAt;
	}
	
	@Column(name = "dossier")
	public String getDossier() {
		return dossier;
	}

	public void setDossier(String dossier) {
		this.dossier = dossier;
	}
	
	@Column(name = "direction")
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Column(name = "ordrep")
	public String getOrdrep() {
		return ordrep;
	}

	public void setOrdrep(String ordrep) {
		this.ordrep = ordrep;
	}

	
	@Column(name = "dateEnvoieAuAp")
	public String getDateEnvoieAuAp() {
		return dateEnvoieAuAp;
	}

	public void setDateEnvoieAuAp(String dateEnvoieAuAp) {
		this.dateEnvoieAuAp = dateEnvoieAuAp;
	}


	@Column(name = "dateRefusParAp")
	public String getDateRefusParAp() {
		return dateRefusParAp;
	}

	public void setDateRefusParAp(String dateRefusParAp) {
		this.dateRefusParAp = dateRefusParAp;
	}


	@Column(name = "datValidationParAp")
	public String getDatValidationParAp() {
		return datValidationParAp;
	}

	public void setDatValidationParAp(String datValidationParAp) {
		this.datValidationParAp = datValidationParAp;
	}


	@Column(name = "dateRefusParTreso")
	public String getDateRefusParTreso() {
		return dateRefusParTreso;
	}

	public void setDateRefusParTreso(String dateRefusParTreso) {
		this.dateRefusParTreso = dateRefusParTreso;
	}


	@Column(name = "dateValidationParTreso")
	public String getDateValidationParTreso() {
		return dateValidationParTreso;
	}

	public void setDateValidationParTreso(String dateValidationParTreso) {
		this.dateValidationParTreso = dateValidationParTreso;
	}



	@Column(name = "raisonRefusAp")
	public String getRaisonRefusAp() {
		return raisonRefusAp;
	}

	public void setRaisonRefusAp(String raisonRefusAp) {
		this.raisonRefusAp = raisonRefusAp;
	}



	@Column(name = "codeAp")
	public String getCodeAp() {
		return codeAp;
	}

	public void setCodeAp(String codeAp) {
		this.codeAp = codeAp;
	}


	@Column(name = "toAp")
	public String getToAp() {
		return toAp;
	}

	public void setToAp(String toAp) {
		this.toAp = toAp;
	}

	public String getCodeTreso() {
		return codeTreso;
	}

	public void setCodeTreso(String codeTreso) {
		this.codeTreso = codeTreso;
	}

	public String getRaisonRefusTreso() {
		return raisonRefusTreso;
	}

	public void setRaisonRefusTreso(String raisonRefusTreso) {
		this.raisonRefusTreso = raisonRefusTreso;
	}





	
	
}
