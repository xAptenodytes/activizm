package ru.xaptenodytes.activizm.model;

// Generated 24.05.2015 22:32:50 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name = "roles", catalog = "activizm")
public class Roles implements java.io.Serializable {

	private Integer roleId;
	private Userroles userroles;
	private String roleName;

	public Roles() {
	}

	public Roles(Userroles userroles) {
		this.userroles = userroles;
	}

	public Roles(Userroles userroles, String roleName) {
		this.userroles = userroles;
		this.roleName = roleName;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "userroles"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "roleId", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Userroles getUserroles() {
		return this.userroles;
	}

	public void setUserroles(Userroles userroles) {
		this.userroles = userroles;
	}

	@Column(name = "roleName", length = 50)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}