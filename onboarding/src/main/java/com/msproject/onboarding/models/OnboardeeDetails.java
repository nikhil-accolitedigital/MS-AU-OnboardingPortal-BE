package com.msproject.onboarding.models;

import java.util.Date;

public class OnboardeeDetails {
	private int id;
	private String name; 
    private String email; 
    private Date dob; 
    private String contactno; 
    private String address; 
    private int demandID; 
    private String location;
    private String skills ;
    private Date ETA ;
    private String BGC_status; 
    private String onboarding_status; 
    private Date onboarding_date; 
    private String ms_hiring_manager; 
    private Date creationTm; 
    private Date lastmodifiedTm; 
    private String designation; 
    private String experience; 
    private String graduation;
	
    
    
    public OnboardeeDetails() {
		
	}
    
    
    

	public OnboardeeDetails(String name, String email, Date dob, String contactno, String address, int demandID,
			String location, String skills, Date eTA, String bGC_status, String onboarding_status, Date onboarding_date,
			String ms_hiring_manager, Date creationTm, Date lastmodifiedTm, String designation, String experience,
			String graduation) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.contactno = contactno;
		this.address = address;
		this.demandID = demandID;
		this.location = location;
		this.skills = skills;
		this.ETA = eTA;
		this.BGC_status = bGC_status;
		this.onboarding_status = onboarding_status;
		this.onboarding_date = onboarding_date;
		this.ms_hiring_manager = ms_hiring_manager;
		this.creationTm = creationTm;
		this.lastmodifiedTm = lastmodifiedTm;
		this.designation = designation;
		this.experience = experience;
		this.graduation = graduation;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDemandID() {
		return demandID;
	}

	public void setDemandID(int demandID) {
		this.demandID = demandID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Date getETA() {
		return ETA;
	}

	public void setETA(Date eTA) {
		this.ETA = eTA;
	}

	public String getBGC_status() {
		return BGC_status;
	}

	public void setBGC_status(String bGC_status) {
		this.BGC_status = bGC_status;
	}

	public String getOnboarding_status() {
		return onboarding_status;
	}

	public void setOnboarding_status(String onboarding_status) {
		this.onboarding_status = onboarding_status;
	}

	public Date getOnboarding_date() {
		return onboarding_date;
	}

	public void setOnboarding_date(Date onboarding_date) {
		this.onboarding_date = onboarding_date;
	}

	public String getMs_hiring_manager() {
		return ms_hiring_manager;
	}

	public void setMs_hiring_manager(String ms_hiring_manager) {
		this.ms_hiring_manager = ms_hiring_manager;
	}

	public Date getCreationTm() {
		return creationTm;
	}

	public void setCreationTm(Date creationTm) {
		this.creationTm = creationTm;
	}

	public Date getLastmodifiedTm() {
		return lastmodifiedTm;
	}

	public void setLastmodifiedTm(Date lastmodifiedTm) {
		this.lastmodifiedTm = lastmodifiedTm;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getExperience() {
		return experience;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}


    
    
    
    
    
    
    
    
}