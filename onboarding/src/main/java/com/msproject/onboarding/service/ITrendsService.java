package com.msproject.onboarding.service;

import java.util.Map;
import java.util.List;

public interface ITrendsService {

	public List<Map<String, Object>> getCountLoc();
	public List<Map<String, Object>> getCountSkills();
	public List<Map<String, Object>> getCountBGC();
	public List<Map<String, Object>> getCountOnboarding();

}