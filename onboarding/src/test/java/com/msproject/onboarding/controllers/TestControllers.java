package com.msproject.onboarding.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msproject.onboarding.dao.IOnboardingDao;
import com.msproject.onboarding.models.OnboardeeDetails;
import com.msproject.onboarding.service.impl.OnboardingService;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestControllers {
	
	   @Mock
	   IOnboardingDao iOnboardingDao;
	   
	   @InjectMocks
	   OnboardingService iOnboardingService;
	   
	   @Autowired
	   private MockMvc mvc;
	   
	   @Autowired
	    ObjectMapper objectMapper;
	   
	
	   @Test
	   public void getAllTest() throws Exception  {
	      List<OnboardeeDetails> onboardeeList = new ArrayList<OnboardeeDetails>();
	      OnboardeeDetails onboardee = getMockedObject();
	      onboardeeList.add(onboardee);
	      Mockito.when(iOnboardingService.getAll()).thenReturn(onboardeeList);
	      MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/onboardee/getAll").accept(MediaType.APPLICATION_JSON)).andReturn();
	      MockHttpServletResponse response = result.getResponse();
	      assertEquals(HttpStatus.OK.value(), response.getStatus());
	   }
	   
	   @Test
	   public void saveTest() throws Exception  {
		   OnboardeeDetails onboardee = getMockedObject();   
		   Mockito.when(iOnboardingService.save(onboardee)).thenReturn(onboardee);

	        mvc.perform(MockMvcRequestBuilders.post("/onboardee/save")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(objectMapper.writeValueAsBytes(onboardee))
	        ).andExpect(status().isOk()).andReturn();
	   }
	   
	   @Test
	   void updateTest() throws Exception
	   {
	     
	     OnboardeeDetails onboardee = getMockedObject();
	     
	     Mockito.when(iOnboardingService.update(onboardee)).thenReturn(1);
	     mvc.perform(MockMvcRequestBuilders.post("/onboardee/update")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(objectMapper.writeValueAsBytes(onboardee))
	        ).andExpect(status().isOk()).andReturn();
	     
	   }
	   
	   
	   
	   

	private OnboardeeDetails getMockedObject() {
		   OnboardeeDetails onboardeeObj = new OnboardeeDetails("raj" , "aman123@gmail.com" , new Date(1998-02-26) , "15236547896" , "delhi",123 , "Bangalore" , "C++" , new Date(1998-02-26) , "pending" , "pending", new Date(1998-02-26) , "Ashok Kumar" , new Date(1998-02-26) , new Date(1998-02-26) , "Dev Intern" , "null" , "appearing");
		   return onboardeeObj;
	}
	
	
	
	
	

}


