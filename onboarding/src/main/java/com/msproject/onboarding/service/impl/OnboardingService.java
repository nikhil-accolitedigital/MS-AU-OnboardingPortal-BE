package com.msproject.onboarding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproject.onboarding.dao.IOnboardingDao;
import com.msproject.onboarding.models.OnboardeeDetails;
import com.msproject.onboarding.service.IOnboardingService;

@Service
public class OnboardingService implements IOnboardingService{

	@Autowired
	IOnboardingDao iOnboardingDao;
	
	@Override
	public OnboardeeDetails save(OnboardeeDetails onboardee) {
		
		return iOnboardingDao.save(onboardee);
	}

	@Override
	public int deleteById(int id) {
		return iOnboardingDao.deleteById(id);
		
	}

	@Override
	public List<OnboardeeDetails> getAll() {
		return iOnboardingDao.getAll();
		
	}

	@Override
	public int update(OnboardeeDetails onboardee) {
		
		return iOnboardingDao.update(onboardee);
	}

}
