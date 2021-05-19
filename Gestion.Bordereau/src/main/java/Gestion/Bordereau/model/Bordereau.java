package Gestion.Bordereau.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bordereau")
public class Bordereau {
	
	private Long id;
	private String reference;
	private String nature;
	private String natureRaff;
	private String status;
	private String folder;
	private Timestamp sentAt;
	private String sentBy;
	private String createdBy;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private String toAp;

	public Bordereau(Long id, String reference, String nature, String status, String folder, Timestamp sentAt,
			String sentBy, Timestamp createdAt, Timestamp updatedAt, String createdBy, String natureRaff
			,String toAP) {
		super();
		this.id = id;
		this.reference = reference;
		this.nature = nature;
		this.status = status;
		this.folder = folder;
		this.sentAt = sentAt;
		this.sentBy = sentBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.createdBy=createdBy;
		this.natureRaff=natureRaff;
		this.toAp=toAP;
		}
	
	public Bordereau() {
		
	}
	
    public Bordereau(Long id) {
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

	@Column(name = "reference")
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Column(name = "nature")
	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
	
	@Column(name = "nature_raff")
	public String getNatureRaff() {
		return natureRaff;
	}

	public void setNatureRaff(String natureRaff) {
		this.natureRaff = natureRaff;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "folder")
	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	@Column(name = "sent_at")
	public Timestamp getSentAt() {
		return sentAt;
	}

	public void setSentAt(Timestamp sentAt) {
		this.sentAt = sentAt;
	}

	@Column(name = "sent_by")
	public String getSentBy() {
		return sentBy;
	}

	public void setSentBy(String sentBy) {
		this.sentBy = sentBy;
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

	@Column(name = "created_by")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	
	@Column(name = "to_ap")
	public String getToAp() {
		return toAp;
	}

	public void setToAp(String toAp) {
		this.toAp = toAp;
	}
	
	
    
    
}
