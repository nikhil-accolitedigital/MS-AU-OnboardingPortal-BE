package com.msproject.onboarding.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproject.onboarding.service.impl.TrendsService;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/trends")
public class TrendsController {

    @Autowired
    TrendsService trendsServiceImpl;

    @GetMapping("/getLocation")
    public List<Map<String, Object>> getCountLoc()
    {
    	List<Map<String, Object>> list = trendsServiceImpl.getCountLoc();
        return list;
    }
    
    @GetMapping("/getSkills")
    public List<Map<String, Object>> getCountSkills()
    {
    	List<Map<String, Object>> list = trendsServiceImpl.getCountSkills();
        return list;
    }
    
    @GetMapping("/getBGC")
    public List<Map<String, Object>> getCountBGC()
    {
    	List<Map<String, Object>> list = trendsServiceImpl.getCountBGC();
        return list;
    }
    
    @GetMapping("/getOnboarding")
    public List<Map<String, Object>> getCountOnboarding()
    {
    	List<Map<String, Object>> list = trendsServiceImpl.getCountOnboarding();
        return list;
    }
}