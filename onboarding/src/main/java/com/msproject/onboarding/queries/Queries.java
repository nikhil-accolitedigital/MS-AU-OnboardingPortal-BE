package com.msproject.onboarding.queries;

import com.msproject.onboarding.table.constants.OnboardingTableConstants;

public class Queries {
	
	private Queries() {
		
	}
	

	
	public static final String INSERT_QUERY = "INSERT INTO onboardee_details (name , email , dob , contactno , address , demandID , location , skills , ETA , BGC_status , onboarding_status, onboarding_date , ms_hiring_manager , creationTm , lastmodifiedTm , designation , experience , graduation )"
			+ "VALUES (:name , :email , :dob , :contactno , :address , :demandID , :location , :skills , :ETA , :BGC_status , :onboarding_status, :onboarding_date , :ms_hiring_manager , :creationTm , :lastmodifiedTm , :designation , :experience , :graduation )"; 
			
	
	public static final String VIEW_QUERY = "SELECT * FROM " + OnboardingTableConstants.TABLE_NAME;
	
	public static final String DELETE_QUERY = "DELETE FROM " + OnboardingTableConstants.TABLE_NAME + " WHERE "
			+ OnboardingTableConstants.ID + " =:" + OnboardingTableConstants.ID;
	
	public static final String UPDATE_QUERY = "UPDATE " + OnboardingTableConstants.TABLE_NAME + " SET " + OnboardingTableConstants.NAME +" =:" + OnboardingTableConstants.NAME+  " , " 
	        + OnboardingTableConstants.EMAIL +" =:" + OnboardingTableConstants.EMAIL + " , " + OnboardingTableConstants.DOB + " =:"+ OnboardingTableConstants.DOB +  " , " 
			+ OnboardingTableConstants.CONTACT + " =:" + OnboardingTableConstants.CONTACT + " , "+ OnboardingTableConstants.ADDRESS + " =:"+ OnboardingTableConstants.ADDRESS +" , " 
	        + OnboardingTableConstants.DEMANDID + "=:"+ OnboardingTableConstants.DEMANDID +", " + OnboardingTableConstants.LOCATION + " =:"+ OnboardingTableConstants.LOCATION +" , "
			+ OnboardingTableConstants.SKILLS + " =:" + OnboardingTableConstants.SKILLS + " , "+ OnboardingTableConstants.ETA + " =:" + OnboardingTableConstants.ETA +", "
			+ OnboardingTableConstants.BGC_STATUS + "=:" + OnboardingTableConstants.BGC_STATUS + " , " + OnboardingTableConstants.ONBOARDING_STATUS + " =:" + OnboardingTableConstants.ONBOARDING_STATUS+ " , " 
			+ OnboardingTableConstants.ONBOARDING_DATE + " =:" + OnboardingTableConstants.ONBOARDING_DATE+ ", "+ OnboardingTableConstants.MS_HIRING_MANAGER + " =:" + OnboardingTableConstants.MS_HIRING_MANAGER +" , " 
			+ OnboardingTableConstants.CREATION_TM + " =:" + OnboardingTableConstants.CREATION_TM +" , " + OnboardingTableConstants.LAST_MODIFIED_TM + " =:"+ OnboardingTableConstants.LAST_MODIFIED_TM+" , " 
			+ OnboardingTableConstants.DESIGNATION + " =:" + OnboardingTableConstants.DESIGNATION +", "+ OnboardingTableConstants.EXPERIENCE + " =:" + OnboardingTableConstants.EXPERIENCE+" , "
			+ OnboardingTableConstants.GRADUATION + " =:"+ OnboardingTableConstants.GRADUATION + " WHERE "+ OnboardingTableConstants.ID + " =:" + OnboardingTableConstants.ID;
	
	
}


