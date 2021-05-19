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
@Table(name="facture_vd_comdist")
public class FactureComdist extends Facture{
	
	private String comdis;
	private Long idfiscale;
	private Date delaip;
	private Date datebc;
	private Date datefct;
	private String dossier;
	private String beneficiaire;
	private String numFacture;
	private String direction;
	private Timestamp createdAt, updatedAt;
	
	  
	public FactureComdist(Long id, String f,int bordereau, String devise, double montant, String objet, String num_po,
			String status, String factname, String pathpdf, Date datereception, String created_by, String dossier,
			int fournisseur, String beneficiaire, String numFacture, String direction, Timestamp createdAt,
			Timestamp updatedAt, Date delai, Date datebc, Date datefct, Long idf, String comdis, String pj
			, String dateEnvoieAuAp, String dateRefusParAp,String datValidationParAp,String dateRefusParTreso,
			String dateValidationParTreso, String raisonRefusAp, String codeAp,String toAp,
			String codeTreso, String raisonRefusTreso) {
		super(id, f, bordereau, devise, montant, objet, num_po, status, factname, pathpdf, datereception, created_by,
				pj, dateEnvoieAuAp, dateRefusParAp, datValidationParAp,
				dateRefusParTreso, dateValidationParTreso, raisonRefusAp, codeAp, toAp, codeTreso, raisonRefusTreso);
		
	
		
		this.dossier = dossier;
		this.beneficiaire = beneficiaire;
		this.numFacture = numFacture;
		this.direction = direction;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.datebc=datebc;
		this.delaip=delai;
		this.datefct=datefct;
		this.idfiscale=idf;
		this.comdis=comdis;
	}
	
	public FactureComdist () {
		
	}
	
public FactureComdist (Long id) {
		this.id=id;
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

public void setPieceJointe(String pj) {
	this.pieceJointe = pj;
}


@Column(name = "dossier")
public String getDossier() {
	return dossier;
}

public void setDossier(String dossier) {
	this.dossier = dossier;
}

@Column(name = "fournisseur")
public String getFournisseur() {
	return fournisseur;
}

public void setFournisseur(String fournisseur) {
	this.fournisseur = fournisseur;
}

@Column(name = "beneficiaire")
public String getBeneficiaire() {
	return beneficiaire;
}

public void setBeneficiaire(String beneficiaire) {
	this.beneficiaire = beneficiaire;
}

@Column(name = "num_fact")
public String getNumFacture() {
	return numFacture;
}

public void setNumFacture(String numFacture) {
	this.numFacture = numFacture;
}

@Column(name = "direction")
public String getDirection() {
	return direction;
}

public void setDirection(String direction) {
	this.direction = direction;
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


@Column(name = "delaip")
public Date getDelaip() {
	return delaip;
}

public void setDelaip(Date delaip) {
	this.delaip = delaip;
}

@Column(name = "datebc")
public Date getDatebc() {
	return datebc;
}

public void setDatebc(Date datebc) {
	this.datebc = datebc;
}

@Column(name = "datefct")
public Date getDatefct() {
	return datefct;
}

public void setDatefct(Date datefct) {
	this.datefct = datefct;
}

@Column(name = "idf")
public Long getIdfiscale() {
	return idfiscale;
}

public void setIdfiscale(Long idfiscale) {
	this.idfiscale = idfiscale;
}

@Column(name = "comdis")
public String getComdis() {
	return comdis;
}

public void setComdis(String comdis) {
	this.comdis = comdis;
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


