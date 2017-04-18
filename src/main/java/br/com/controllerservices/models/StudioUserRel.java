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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_studio_user_rel")
public class StudioUserRel{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_studio_user_rel")
	private Long idStudioUserRel;

	@OneToMany
	@JoinColumn(name="id_studio")
	private List<Studio> idStudio;

	@ManyToOne
	@JoinColumn(name="id_user")
	private User idUser;

	@Column(name = "status")
    private Integer status;

	@Column(name = "dt_create")
	@Temporal(TemporalType.DATE)
    private Date dtCreate;

	@Column(name = "dt_update")
	@Temporal(TemporalType.DATE)
    private Date dtUpdate;

	public Long getIdStudioUserRel() {
		return idStudioUserRel;
	}

	public void setIdStudioUserRel(Long idStudioUserRel) {
		this.idStudioUserRel = idStudioUserRel;
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

	public List<Studio> getIdStudio() {
		return idStudio;
	}

	public void setIdStudio(List<Studio> idStudio) {
		this.idStudio = idStudio;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}


}
