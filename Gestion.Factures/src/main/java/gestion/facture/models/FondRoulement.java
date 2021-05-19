package gestion.facture.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FondRoulement extends Facture{

	  protected Long id ; 
	  protected String type;
	  protected String fournisseur;
	  protected int bordereau; 
	  protected String devise; 
	  protected double montant;
	  protected String objet;
	  protected String num_po;
	  protected String status;
	  protected String factname;
	  protected String pathpdf;
	  protected Date datereception;
	  protected String created_by;
	  protected String pieceJointe;
	  protected String dateEnvoieAuAp;
	  protected String dateRefusParAp;
	  protected String datValidationParAp;
	  protected String dateRefusParTreso;
	  protected String dateValidationParTreso;
	  protected String raisonRefusAp;
	  protected String codeAp;
	  protected String toAp;
	  protected String ordrep;
	  protected String structure;
	  protected String benefice;
	  protected Date dateOrdreP;
	  protected int direction;
	
	  
	  public FondRoulement(Long id, String fournisseur, int bordereau, String devise,double montant
			  ,String objet, String num_po, String status, String factname, String pathpdf, Date datereception,
			  String created_by, String pieceJointe, String dateEnvoieAuAp,String dateRefusParAp,
			  String datValidationParAp, String dateRefusParTreso, String dateValidationParTreso,
			  String raisonRefusAp, String codeAp, String toAp, String ordrep, String structure,
			  String benefice, Date dateOrdreP, int direction, String type,String codeTreso,
			  String raisonRefusTreso) {
		  
		  super(id, fournisseur, bordereau, devise, montant, objet, num_po, status, factname, pathpdf,
				  datereception, created_by, benefice, dateEnvoieAuAp, dateRefusParAp, datValidationParAp, 
				  dateRefusParTreso, dateValidationParTreso, raisonRefusAp, codeAp, toAp, codeTreso,
				  raisonRefusTreso );
			
		  this.dateOrdreP=dateOrdreP;
		  this.structure=structure;
		  this.benefice=benefice;
		  this.direction=direction;
		  this.ordrep=ordrep;
		  this.type=type;
		}

	   public FondRoulement() {
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

	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "fournisseur")
	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
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

	
	@Column(name = "numPo")
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
	public String getPathpdf() {
		return pathpdf;
	}

	public void setPathpdf(String pathpdf) {
		this.pathpdf = pathpdf;
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

	
	@Column(name = "piece_jointe")
	public String getPieceJointe() {
		return pieceJointe;
	}

	public void setPieceJointe(String pieceJointe) {
		this.pieceJointe = pieceJointe;
	}

	
	@Column(name = "date_envoi_au_ap")
	public String getDateEnvoieAuAp() {
		return dateEnvoieAuAp;
	}

	public void setDateEnvoieAuAp(String dateEnvoieAuAp) {
		this.dateEnvoieAuAp = dateEnvoieAuAp;
	}

	
	@Column(name = "date_refus_par_ap")
	public String getDateRefusParAp() {
		return dateRefusParAp;
	}

	public void setDateRefusParAp(String dateRefusParAp) {
		this.dateRefusParAp = dateRefusParAp;
	}

	@Column(name = "date_validation_par_ap")
	public String getDatValidationParAp() {
		return datValidationParAp;
	}

	public void setDatValidationParAp(String datValidationParAp) {
		this.datValidationParAp = datValidationParAp;
	}

	
	@Column(name = "date_refus_par_treso")
	public String getDateRefusParTreso() {
		return dateRefusParTreso;
	}

	public void setDateRefusParTreso(String dateRefusParTreso) {
		this.dateRefusParTreso = dateRefusParTreso;
	}

	@Column(name = "date_validation_par_treso")
	public String getDateValidationParTreso() {
		return dateValidationParTreso;
	}

	public void setDateValidationParTreso(String dateValidationParTreso) {
		this.dateValidationParTreso = dateValidationParTreso;
	}

	
	@Column(name = "raison_refus_ap")
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

	@Column(name = "to_ap")
	public String getToAp() {
		return toAp;
	}

	public void setToAp(String toAp) {
		this.toAp = toAp;
	}

	@Column(name = "ordre_paiement")
	public String getOrdrep() {
		return ordrep;
	}

	public void setOrdrep(String ordrep) {
		this.ordrep = ordrep;
	}

	
	@Column(name = "structure")
	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	
	@Column(name = "benefice")
	public String getBenefice() {
		return benefice;
	}

	public void setBenefice(String benefice) {
		this.benefice = benefice;
	}

	
	@Column(name = "date_ordre_paiement")
	public Date getDateOrdreP() {
		return dateOrdreP;
	}

	public void setDateOrdreP(Date dateOrdreP) {
		this.dateOrdreP = dateOrdreP;
	}

	
	@Column(name = "direction")
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
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
