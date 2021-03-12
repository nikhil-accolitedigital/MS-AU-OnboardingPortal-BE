package com.msproject.onboarding.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.msproject.onboarding.service.ITrendsService;
import java.util.*;

@Repository("TrendsService")
@Transactional
public class TrendsService implements ITrendsService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> getCountLoc() {
        String SQL = "SELECT location as name , count(id) as value from onboardee_details group by location ";
        return jdbcTemplate.queryForList(SQL);
        
    }

	@Override
	public List<Map<String, Object>> getCountSkills() {
		String SQL = "SELECT skills as name , count(id) as value from onboardee_details group by skills ";
        return jdbcTemplate.queryForList(SQL);
		
	}

	@Override
	public List<Map<String, Object>> getCountBGC() {
		String SQL = "SELECT BGC_status as name , count(id) as value from onboardee_details group by BGC_status ";
        return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> getCountOnboarding() {
		String SQL = "SELECT onboarding_status as name , count(id) as value from onboardee_details group by onboarding_status ";
        return jdbcTemplate.queryForList(SQL);
	}
}

