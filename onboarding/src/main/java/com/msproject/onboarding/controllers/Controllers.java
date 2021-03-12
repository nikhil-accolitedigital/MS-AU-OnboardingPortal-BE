package com.msproject.onboarding.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msproject.onboarding.models.OnboardeeDetails;
import com.msproject.onboarding.service.IOnboardingService;



@RestController
@RequestMapping("onboardee")
public class Controllers implements IOnboardingService {
	
	
	
	@Autowired
	IOnboardingService iOnboardingService;

	@PostMapping("/save")
	public OnboardeeDetails save(@RequestBody OnboardeeDetails onboardee) {
		return iOnboardingService.save(onboardee);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public int deleteById(@PathVariable int id) {
		return iOnboardingService.deleteById(id);
	}
	
	@GetMapping("/getAll")
	public List<OnboardeeDetails> getAll() {
		return iOnboardingService.getAll();

	}
	
	@PostMapping("/update")
	public int update(@RequestBody OnboardeeDetails onboardee ) {
		return iOnboardingService.update(onboardee);
	}
	

}
