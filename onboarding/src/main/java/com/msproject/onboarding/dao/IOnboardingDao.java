package com.msproject.onboarding.dao;

import java.util.List;

import com.msproject.onboarding.models.OnboardeeDetails;

public interface IOnboardingDao {
	public OnboardeeDetails save(OnboardeeDetails onboardee);
	public int deleteById(int id);
	public List<OnboardeeDetails> getAll();
	public int update(OnboardeeDetails onboardee);

	

}
