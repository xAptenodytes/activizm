package ru.xaptenodytes.activizm.model;

// Generated 18.05.2015 14:47:17 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Communities generated by hbm2java
 */
@Entity
@Table(name = "communities", catalog = "activizm")
public class Communities implements java.io.Serializable {

	private Integer comunityId;
	private Subcommunities subcommunities;
	private String comunityName;
	private Set organisationeventtypes = new HashSet(0);

	public Communities() {
	}

	public Communities(Subcommunities subcommunities, String comunityName) {
		this.subcommunities = subcommunities;
		this.comunityName = comunityName;
	}

	public Communities(Subcommunities subcommunities, String comunityName,
			Set organisationeventtypes) {
		this.subcommunities = subcommunities;
		this.comunityName = comunityName;
		this.organisationeventtypes = organisationeventtypes;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "subcommunities"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "comunityId", unique = true, nullable = false)
	public Integer getComunityId() {
		return this.comunityId;
	}

	public void setComunityId(Integer comunityId) {
		this.comunityId = comunityId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Subcommunities getSubcommunities() {
		return this.subcommunities;
	}

	public void setSubcommunities(Subcommunities subcommunities) {
		this.subcommunities = subcommunities;
	}

	@Column(name = "comunityName", nullable = false, length = 150)
	public String getComunityName() {
		return this.comunityName;
	}

	public void setComunityName(String comunityName) {
		this.comunityName = comunityName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "communities")
	public Set getOrganisationeventtypes() {
		return this.organisationeventtypes;
	}

	public void setOrganisationeventtypes(Set organisationeventtypes) {
		this.organisationeventtypes = organisationeventtypes;
	}

}
