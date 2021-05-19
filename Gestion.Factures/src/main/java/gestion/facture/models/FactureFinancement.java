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
@Table(name="facture_financement")
public class FactureFinancement extends Facture{
	
	private String typeFin;
	private String destinataire;
	private String credit;
	private String echeance;
	private Timestamp updatedAt;
	private Timestamp crAt;
	protected int fournisseur;
	protected Date dateOp;


	  


	
	public FactureFinancement(Long id,String f ,int bordereau, String devise, double montant, String objet, String num_po,
			String status, String factname, String pathpdf, Date datereception, String created_by, String typeFin,
			String destinataire, String credit, String echeance, Timestamp updated, int fournisseur, String pj
			, String dateEnvoieAuAp, String dateRefusParAp,String datValidationParAp,String dateRefusParTreso,
			String dateValidationParTreso, String raisonRefusAp, String codeAp,String toAp, Date dateOp,
			String codeTreso, String raisonRefusTreso) {
		
		super(id, typeFin, bordereau, devise, montant, objet, num_po, status, factname, pathpdf, datereception, created_by, pj, dateEnvoieAuAp, dateRefusParAp,
				datValidationParAp, dateRefusParTreso, dateValidationParTreso, raisonRefusAp, codeAp, toAp,
				codeTreso,raisonRefusTreso);
		
		this.typeFin = typeFin;
		this.destinataire = destinataire;
		this.credit = credit;
		this.echeance = echeance;
		this.updatedAt=updated;
		this.fournisseur=fournisseur;
		this.dateOp=dateOp;
	}
	
	
	public FactureFinancement (Long id) {
		this.id=id;
	}
	
	public FactureFinancement() {
		
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
	 
	 @Column(name = "piece_jointe")
		public String getPieceJointe() {
			return pieceJointe;
		}

		public void setPieceJointe(String pieceJointe) {
			this.pieceJointe = pieceJointe;
		}
	    
	
	@Column(name = "type_financement")
	public String getTypeFin() {
		return typeFin;
	}

	public void setTypeFin(String typeFin) {
		this.typeFin = typeFin;
	}

	@Column(name = "destinataire")
	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	@Column(name = "credits")
	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	@Column(name = "echeance")
	public String getEcheance() {
		return echeance;
	}

	public void setEcheance(String echeance) {
		this.echeance = echeance;
	}
	
	
		@Column(name = "bordereau")
		public int getBordereau() {
			return bordereau;
		}

		public void setBordereau(int bordereau) {
			this.bordereau = bordereau;
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

		@Column(name = "num_op")
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
		public String getPathPdf() {
			return pathpdf;
		}


		public void setPathPdf(String pathPdf) {
			this.pathpdf = pathPdf;
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


		@Column(name= "updated_at")
		public Timestamp getUpdatedAt() {
			return updatedAt;
		}


		public void setUpdatedAt(Timestamp updatedAt) {
			this.updatedAt = updatedAt;
		} 
		

		@Column(name= "created_at")
		public Timestamp getcreatedAt() {
			return crAt;
		}


		public void setcreatedAt(Timestamp crAt) {
			this.crAt = crAt;
		}
	
	
		@Column(name= "fournisseurr")
		public int getFournisseur() {
			return fournisseur;
		}


		public void setFournisseur(int fourn) {
			this.fournisseur = fourn;
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

		@Column(name = "dateOp")
		public Date getDateOp() {
			return dateOp;
		}


		public void setDateOp(Date dateOp) {
			this.dateOp = dateOp;
		}


		public Timestamp getCrAt() {
			return crAt;
		}


		public void setCrAt(Timestamp crAt) {
			this.crAt = crAt;
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
