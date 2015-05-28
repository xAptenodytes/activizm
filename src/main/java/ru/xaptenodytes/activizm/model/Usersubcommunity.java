package ru.xaptenodytes.activizm.model;

// Generated 24.05.2015 22:32:50 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usersubcommunity generated by hbm2java
 */
@Entity
@Table(name = "usersubcommunity", catalog = "activizm", uniqueConstraints = @UniqueConstraint(columnNames = "userId"))
public class Usersubcommunity implements java.io.Serializable {

	private Integer usersubcommunityId;
	private Subcommunity subcommunity;
	private int userId;
	private User user;

	public Usersubcommunity() {
	}

	public Usersubcommunity(Subcommunity subcommunity, int userId) {
		this.subcommunity = subcommunity;
		this.userId = userId;
	}

	public Usersubcommunity(Subcommunity subcommunity, int userId,
			User user) {
		this.subcommunity = subcommunity;
		this.userId = userId;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "usersubcommunityId", unique = true, nullable = false)
	public Integer getUsersubcommunityId() {
		return this.usersubcommunityId;
	}

	public void setUsersubcommunityId(Integer usersubcommunityId) {
		this.usersubcommunityId = usersubcommunityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subcommunityId", nullable = false)
	public Subcommunity getSubcommunities() {
		return this.subcommunity;
	}

	public void setSubcommunities(Subcommunity subcommunity) {
		this.subcommunity = subcommunity;
	}

	@Column(name = "userId", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "phones")
	public User getUsers() {
		return this.user;
	}

	public void setUsers(User user) {
		this.user = user;
	}

}
