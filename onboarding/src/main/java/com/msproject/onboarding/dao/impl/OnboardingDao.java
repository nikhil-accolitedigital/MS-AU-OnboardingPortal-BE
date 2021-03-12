package com.msproject.onboarding.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.msproject.onboarding.dao.IOnboardingDao;
import com.msproject.onboarding.models.OnboardeeDetails;
import com.msproject.onboarding.queries.Queries;
import com.msproject.onboarding.table.constants.OnboardingTableConstants;



@Repository
public class OnboardingDao implements IOnboardingDao{
	
	
	private static Logger logger = LoggerFactory.getLogger(OnboardingDao.class);
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public OnboardeeDetails save(OnboardeeDetails onboardee) {
		final KeyHolder holder = new GeneratedKeyHolder();
		String sql = Queries.INSERT_QUERY;
		
		
		MapSqlParameterSource srcMap = new MapSqlParameterSource();
		srcMap.addValue("name", onboardee.getName());
		srcMap.addValue("email", onboardee.getEmail());
		srcMap.addValue("dob", onboardee.getDob());
		srcMap.addValue("contactno", onboardee.getContactno());
		srcMap.addValue("address", onboardee.getAddress());
		srcMap.addValue("demandID", onboardee.getDemandID());
		srcMap.addValue("location", onboardee.getLocation());
		srcMap.addValue("skills", onboardee.getSkills());
		srcMap.addValue("ETA", onboardee.getETA());
		srcMap.addValue("BGC_status", onboardee.getBGC_status());
		srcMap.addValue("onboarding_status", onboardee.getOnboarding_status());
		srcMap.addValue("onboarding_date", onboardee.getOnboarding_date());
		srcMap.addValue("ms_hiring_manager", onboardee.getMs_hiring_manager());
		srcMap.addValue("creationTm", onboardee.getCreationTm());
		srcMap.addValue("lastmodifiedTm", onboardee.getLastmodifiedTm());
		srcMap.addValue("designation", onboardee.getDesignation());
		srcMap.addValue("experience", onboardee.getExperience());
		srcMap.addValue("graduation", onboardee.getGraduation());
		
		namedParameterJdbcTemplate.update(sql, srcMap, holder, new String[] { "ID" });
		onboardee.setId(holder.getKey().intValue());
		return onboardee;
		 
	}

	@Override
	public int deleteById(int id) {
		
		String sql = Queries.DELETE_QUERY;
		logger.info(sql);
		MapSqlParameterSource srcMap = new MapSqlParameterSource();
		srcMap.addValue(OnboardingTableConstants.ID, id);
		return namedParameterJdbcTemplate.update(sql, srcMap);
	}

	@Override
	public List<OnboardeeDetails> getAll() {
		String sql = Queries.VIEW_QUERY;
		logger.info(sql);
		return namedParameterJdbcTemplate.query(sql, (resultSet, i) -> {
		OnboardeeDetails onboardee = new OnboardeeDetails();
		onboardee.setId(resultSet.getInt("ID"));
		onboardee.setName(resultSet.getString("name"));
		onboardee.setEmail(resultSet.getString("email"));
		onboardee.setDob(resultSet.getDate("dob"));
		onboardee.setContactno(resultSet.getString("contactno"));
		onboardee.setAddress(resultSet.getString("address"));
		onboardee.setDemandID(resultSet.getInt("demandID"));
		onboardee.setLocation(resultSet.getString("location"));
		onboardee.setSkills(resultSet.getString("skills"));
		onboardee.setETA(resultSet.getDate("ETA"));
		onboardee.setBGC_status(resultSet.getString("BGC_status"));
		onboardee.setOnboarding_status(resultSet.getString("onboarding_status"));
		onboardee.setOnboarding_date(resultSet.getDate("onboarding_date"));
		onboardee.setMs_hiring_manager(resultSet.getString("ms_hiring_manager"));
		onboardee.setCreationTm(resultSet.getDate("creationTm"));
		onboardee.setLastmodifiedTm(resultSet.getDate("lastmodifiedTm"));
		onboardee.setDesignation(resultSet.getString("designation"));
		onboardee.setExperience(resultSet.getString("experience"));
		onboardee.setGraduation(resultSet.getString("graduation"));
		return onboardee;
	});

 }

	@Override
	public int update(OnboardeeDetails onboardee) {
		int id = onboardee.getId();
		String sql = Queries.UPDATE_QUERY;
		logger.info(sql);
		MapSqlParameterSource srcMap = new MapSqlParameterSource();
		srcMap.addValue(OnboardingTableConstants.ID,id);
		srcMap.addValue(OnboardingTableConstants.NAME,onboardee.getName());
		srcMap.addValue(OnboardingTableConstants.EMAIL,onboardee.getEmail());
		srcMap.addValue(OnboardingTableConstants.DOB,onboardee.getDob());
		srcMap.addValue(OnboardingTableConstants.CONTACT,onboardee.getContactno());
		srcMap.addValue(OnboardingTableConstants.ADDRESS,onboardee.getAddress());
		srcMap.addValue(OnboardingTableConstants.DEMANDID,onboardee.getDemandID());
		srcMap.addValue(OnboardingTableConstants.LOCATION,onboardee.getLocation());
		srcMap.addValue(OnboardingTableConstants.SKILLS,onboardee.getSkills());
		srcMap.addValue(OnboardingTableConstants.ETA,onboardee.getETA());
		srcMap.addValue(OnboardingTableConstants.BGC_STATUS,onboardee.getBGC_status());
		srcMap.addValue(OnboardingTableConstants.ONBOARDING_STATUS,onboardee.getOnboarding_status());
		srcMap.addValue(OnboardingTableConstants.ONBOARDING_DATE,onboardee.getOnboarding_date());
		srcMap.addValue(OnboardingTableConstants.MS_HIRING_MANAGER,onboardee.getMs_hiring_manager());
		srcMap.addValue(OnboardingTableConstants.CREATION_TM,onboardee.getCreationTm());
		srcMap.addValue(OnboardingTableConstants.LAST_MODIFIED_TM,onboardee.getLastmodifiedTm());
		srcMap.addValue(OnboardingTableConstants.DESIGNATION,onboardee.getDesignation());
		srcMap.addValue(OnboardingTableConstants.EXPERIENCE,onboardee.getExperience());
		srcMap.addValue(OnboardingTableConstants.GRADUATION	,onboardee.getGraduation());
		return namedParameterJdbcTemplate.update(sql, srcMap);
			
				
		
		
	}
	
}

