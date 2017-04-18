package br.com.controllerservices.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author Bruno
 *
 */
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
	private Integer password;

	@Column(name = "email")
    private String email;

	@Column(name = "cel")
    private Integer cel;

	@Column(name = "status")
    private Integer status;

	@Column(name = "dt_create")
	@Temporal(TemporalType.DATE)
    private Date dtCreate;

	@Column(name = "dt_update")
	@Temporal(TemporalType.DATE)
    private Date dtUpdate;

	@Column(name = "user_create")
    private String userCreate;

	@ManyToOne
	@JoinColumn(name="id_rule_type", referencedColumnName="id_rule_type")
    private RuleType rules;

	@Transient
	private List<RuleType> listRules;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<RuleType> getListRules() {
		return listRules;
	}

	public void setListRules(List<RuleType> listRules) {
		this.listRules = listRules;
	}

	public Integer getCel() {
		return cel;
	}

	public void setCel(Integer cel) {
		this.cel = cel;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}


}
