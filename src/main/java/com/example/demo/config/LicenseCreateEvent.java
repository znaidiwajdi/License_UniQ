package com.example.demo.config;

import org.springframework.context.ApplicationEvent;

import com.example.demo.model.License;

public class LicenseCreateEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private License license;
	public LicenseCreateEvent(Object source, License license1) {
		super(source);
		this.setLicense(license1);
		// TODO Auto-generated constructor stub
	}
	
	

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}


}
