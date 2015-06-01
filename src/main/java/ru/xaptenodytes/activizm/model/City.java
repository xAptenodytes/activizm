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
 * Cities generated by hbm2java
 */
@Entity
@Table(name = "cities", catalog = "activizm")
public class City implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4222830336499892809L;
	private Integer cityId;
	private Event event;
	private Subcommunity subcommunity;
	private User user;
	private String cityName;

	public City() {
	}

	public City(Event event, Subcommunity subcommunity, User user) {
		this.event = event;
		this.subcommunity = subcommunity;
		this.user = user;
	}

	public City(Event event, Subcommunity subcommunity, User user,
			String cityName) {
		this.event = event;
		this.subcommunity = subcommunity;
		this.user = user;
		this.cityName = cityName;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "events"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "CityId", unique = true, nullable = false)
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Event getEvents() {
		return this.event;
	}

	public void setEvents(Event event) {
		this.event = event;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Subcommunity getSubcommunities() {
		return this.subcommunity;
	}

	public void setSubcommunities(Subcommunity subcommunity) {
		this.subcommunity = subcommunity;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public User getUsers() {
		return this.user;
	}

	public void setUsers(User user) {
		this.user = user;
	}

	@Column(name = "CityName", length = 200)
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
