package br.com.controllerservices.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_studio")
public class Studio{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_studio")
	private Long idStudio;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "adress")
    private String adress;

	@Column(name = "complement")
    private String complement;

	@Column(name = "adress_number")
    private Integer adressNumber;

	@Column(name = "dt_create")
	@Temporal(TemporalType.TIMESTAMP)
    private Date dtCreate;

	@Column(name = "dt_update")
	@Temporal(TemporalType.TIMESTAMP)
    private Date dtUpdate;

	@Column(name = "user_create")
    private String userCreate;

	public Long getIdStudio() {
		return idStudio;
	}

	public void setIdStudio(Long idStudio) {
		this.idStudio = idStudio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public Integer getAdressNumber() {
		return adressNumber;
	}

	public void setAdressNumber(Integer adressNumber) {
		this.adressNumber = adressNumber;
	}

	public Date getDtCreate() {
		return dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	public Date getDtUpdate() {
		return dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

	public String getUserCreate() {
		return userCreate;
	}

	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}


}
