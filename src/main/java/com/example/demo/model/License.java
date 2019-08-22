package com.example.demo.model;

import java.io.Serializable;

public class License implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String appName;
	private String module;

	

	private String version;
	private String email;
	private String city;
	private String state;

	private String key;
	private String country;
	private String dateDebut;
	private String dateFin;

	public License() {
		super();
		// TODO Auto-generated constructor stub
	}

	public License(String appName, String version, String email, String city, String state, String key, String country,
			String dateDebut, String dateFin) {
		super();
		this.appName = appName;
		this.version = version;
		this.email = email;
		this.city = city;
		this.state = state;
		this.key = key;
		this.country = country;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	@Override
	public String toString() {
		return "License [appName=" + appName + ", version=" + version + ", email=" + email + ", city=" + city
				+ ", state=" + state + ", key=" + key + ", country=" + country + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + "]";
	}
}
