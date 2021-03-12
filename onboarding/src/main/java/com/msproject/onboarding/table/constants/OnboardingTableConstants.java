package com.msproject.onboarding.table.constants;

public class OnboardingTableConstants {
	
	private OnboardingTableConstants() {
		
	}
	
	
	
	
	public static final String TABLE_NAME = "onboardee_details";
	public static final String ID = "ID";
	public static final String NAME = "name";
	public static final String EMAIL = "email";
	public static final String DOB = "dob";
	public static final String CONTACT = "contactno";
	public static final String ADDRESS = "address";
	public static final String DEMANDID = "demandID";
	public static final String LOCATION = "location";
	public static final String SKILLS = "skills";
	public static final String ETA = "ETA";
	public static final String BGC_STATUS = "BGC_status";
	public static final String ONBOARDING_STATUS = "onboarding_status";
	public static final String ONBOARDING_DATE = "onboarding_date";
	public static final String MS_HIRING_MANAGER = "ms_hiring_manager";
	public static final String DESIGNATION = "designation";
	public static final String EXPERIENCE = "experience";
	public static final String GRADUATION = "graduation";
	public static final String CREATION_TM = "creationTm";
	public static final String LAST_MODIFIED_TM = "lastmodifiedTm";

}


				

/*
name varchar(255) NOT NULL,
email varchar(255) NOT NULL,
dob date NOT NULL,
contactno varchar(20) NOT NULL,
address varchar(255) NOT NULL,
demandID varchar(50) NOT NULL,
location varchar(50) NOT NULL,
skills varchar(50) NOT NULL,
ETA date NOT NULL,
BGC_status varchar(20) NOT NULL,
onboarding_status varchar(20) NOT NULL,
onboarding_date date NOT NULL,
ms_hiring_manager varchar(255) NOT NULL,
creationTm date not null,
lastmodifiedTm date not null,
designation varchar(40) not null,
experience varchar(100) ,
graduation varchar(20) not null,
*/