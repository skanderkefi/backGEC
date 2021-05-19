package gestion.fournisseur.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fournisseur")
public class Fournisseur {
	
	private Long iderp;
	private Long numPo;
	private String name;
	private String categorie;
	private String idFiscale;
	private String adresse;
	private String nationnalite;
	private String createdBy;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public Fournisseur(Long iderp, String name, String categorie, String idFiscale, String adresse,
			String nationnalite, String createdBy, Timestamp createdAt, Timestamp updatedAt,
			Long numPo) {
		super();
		this.iderp = iderp;
		this.name = name;
		this.categorie = categorie;
		this.idFiscale = idFiscale;
		this.adresse = adresse;
		this.nationnalite = nationnalite;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.numPo=numPo;
	}
	
	public Fournisseur() {
		
	}
public Fournisseur(Long iderp) {
		this.iderp=iderp;
	}

@Id
@Column(name = "iderp")
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getIderp() {
	return iderp;
}

public void setIderp(Long iderp) {
	this.iderp = iderp;
}

@Column(name = "name")
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Column(name = "categorie")
public String getCategorie() {
	return categorie;
}

public void setCategorie(String categorie) {
	this.categorie = categorie;
}

@Column(name = "idfiscale")
public String getIdFiscale() {
	return idFiscale;
}

public void setIdFiscale(String idFiscale) {
	this.idFiscale = idFiscale;
}

@Column(name = "adresse")
public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

@Column(name = "nationnalite")
public String getNationnalite() {
	return nationnalite;
}

public void setNationnalite(String nationnalite) {
	this.nationnalite = nationnalite;
}

@Column(name = "created_by")
public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
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

@Column(name = "numPo")
public Long getNumPo() {
	return numPo;
}

public void setNumPo(Long numPo) {
	this.numPo = numPo;
}


	


}
