package gestion.facture.models;

import java.sql.Date;



public class Facture {
	
	  protected Long id ;    
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
	  protected  String codeTreso;
	  protected String raisonRefusTreso;

	  

	  
	public Facture(Long id,String f, int bordereau, String devise, double montant, String objet, String num_po, String status,
			String factname, String pathpdf, Date datereception, String created_by, String pj, String dateEnvoieAuAp,
			String dateRefusParAp,String datValidationParAp,String dateRefusParTreso,String dateValidationParTreso,String raisonRefusAp,
			String codeAp,String toAp,String codeTreso, String raisonRefusTreso) {
		this.id = id;
		this.fournisseur=f;
		this.bordereau = bordereau;
		this.devise = devise;
		this.montant = montant;
		this.objet = objet;
		this.num_po = num_po;
		this.status = status;
		this.factname = factname;
		this.pathpdf = pathpdf;
		this.datereception = datereception;
		this.created_by = created_by;
		this.pieceJointe=pj;
		
		this.dateEnvoieAuAp=dateEnvoieAuAp;
		this.dateRefusParAp=dateRefusParAp;
		this.datValidationParAp=datValidationParAp;
		this.dateRefusParTreso=dateRefusParTreso;
		this.dateValidationParTreso=dateValidationParTreso;
		this.raisonRefusAp=raisonRefusAp;
		this.codeAp=codeAp;
		this.toAp=toAp;
		
		this.codeTreso=codeTreso;
		this.raisonRefusTreso=raisonRefusTreso;

	}
	
	public Facture() {
		
	}
	
	  

	 

}
