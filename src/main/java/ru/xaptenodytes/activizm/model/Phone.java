package ru.xaptenodytes.activizm.model;

// Generated 24.05.2015 22:32:50 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Phones generated by hbm2java
 */
@Entity
@Table(name = "phones", catalog = "activizm", uniqueConstraints = @UniqueConstraint(columnNames = "userId"))
public class Phone implements java.io.Serializable {

	private Integer phoneId;
	private String phoneNumber;
	private int userId;
	private User user;

	public Phone() {
	}

	public Phone(String phoneNumber, int userId) {
		this.phoneNumber = phoneNumber;
		this.userId = userId;
	}

	public Phone(String phoneNumber, int userId, User user) {
		this.phoneNumber = phoneNumber;
		this.userId = userId;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "phoneId", unique = true, nullable = false)
	public Integer getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	@Column(name = "phoneNumber", nullable = false, length = 50)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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