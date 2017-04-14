package br.com.controllerservices.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_rule_type")
public class RuleType{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rule_type")
    private Long idRuleType;

	@Column(name = "name_group")
    private String name;

	public Long getIdRuleType() {
		return idRuleType;
	}

	public void setIdRuleType(Long idRuleType) {
		this.idRuleType = idRuleType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
