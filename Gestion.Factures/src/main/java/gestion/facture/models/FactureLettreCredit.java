package gestion.facture.models;

import java.io.BufferedReader;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facture_lettre_credit")
public class FactureLettreCredit extends Facture{
	
	private String fournisseur;
	private String dossier;
	private String structure;
	private String direction;
	private Date dateFact;
	private String periodeConso;
	private String numFacture;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String idFiscale;

	
	public FactureLettreCredit(Long id,String f, int bordereau, String devise, double montant, String objet, String num_po,
			String status, String factname, String pathpdf, Date datereception, String created_by, String fournisseur,
			String dossier, String structure, String direction, Date dateFact, String periodeConso, String numFacture, 
			Timestamp crAt, Timestamp updAt, String idFiscale, String pieceJointe
			, String dateEnvoieAuAp, String dateRefusParAp,String datValidationParAp,String dateRefusParTreso,
			String dateValidationParTreso, String raisonRefusAp, String codeAp,String toAp,String codeTreso,
			String raisonRefusTreso) {
		
		super(id, fournisseur, bordereau, devise, montant, objet, num_po, status, factname, pathpdf, datereception, created_by,
				pieceJointe, dateEnvoieAuAp, dateRefusParAp, datValidationParAp, dateRefusParTreso,
				dateValidationParTreso, raisonRefusAp, codeAp, toAp, codeTreso,raisonRefusTreso );
		
		this.dossier = dossier;
		this.structure = structure;
		this.direction = direction;
		this.dateFact = dateFact;
		this.periodeConso = periodeConso;
		this.numFacture = numFacture;
		this.createdAt=crAt;
		this.updatedAt=updAt;
		this.idFiscale=idFiscale;
	}
	
	public FactureLettreCredit (Long id) {
		this.id=id;
	}

	public FactureLettreCredit () {
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
				
				@Column(name = "piece_jointe")
				public String getPieceJointe() {
					return pieceJointe;
				}

				public void setPieceJointe(String pieceJointe) {
					this.pieceJointe = pieceJointe;
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
				
			
		    
		    
	@Column(name = "fournisseur")
	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	@Column(name = "dossier")
	public String getDossier() {
		return dossier;
	}

	public void setDossier(String dossier) {
		this.dossier = dossier;
	}

	@Column(name = "structure")
	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	@Column(name = "direction")
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Column(name = "date_fact")
	public Date getDateFact() {
		return dateFact;
	}

	public void setDateFact(Date dateFact) {
		this.dateFact = dateFact;
	}

	@Column(name = "period_conso")
	public String getPeriodeConso() {
		return periodeConso;
	}

	public void setPeriodeConso(String periodeConso) {
		this.periodeConso = periodeConso;
	}

	@Column(name = "num_fact")
	public String getNumFacture() {
		return numFacture;
	}

	
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
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
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "idFiscale")
	public String getIdFiscale() {
		
		return idFiscale;
	}

	public void setIdFiscale(String idFiscale) {
		this.idFiscale = idFiscale;
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
