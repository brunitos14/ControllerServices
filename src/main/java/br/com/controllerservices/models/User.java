package br.com.controllerservices.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
	private Long idUser;

	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;

	@Column(name = "email")
    private String email;
	
	@Column(name = "cel")
    private Long cel;
	
	@Column(name = "status")
    private Integer status;
	
	@Column(name = "dt_create")
    private Date dtCreate;
	
	@Column(name = "dt_update")
    private Date dtUpdate;
	
	@Column(name = "user_create")
    private String userCreate;
	
	@OneToOne
	@JoinColumn(name="id_rule_type")
    private RuleType rules;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCel() {
		return cel;
	}

	public void setCel(Long cel) {
		this.cel = cel;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public RuleType getRules() {
		return rules;
	}

	public void setRules(RuleType rules) {
		this.rules = rules;
	}


}
