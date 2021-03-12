package com.msproject.onboarding.test.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.msproject.onboarding.dao.IOnboardingDao;
import com.msproject.onboarding.models.OnboardeeDetails;
import com.msproject.onboarding.service.impl.OnboardingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServices {
   
   @Mock
   IOnboardingDao iOnboardingDao;
   
   @InjectMocks
   OnboardingService iOnboardingService;
   
   
   @Test
   public void saveTest()  {
      OnboardeeDetails onboardee = getMockedObject();
      Mockito.when(iOnboardingDao.save(Mockito.any())).thenReturn(onboardee);
      OnboardeeDetails output = iOnboardingService.save(onboardee);
      assertEquals("raj",output.getName());
   }
   
   @Test
   public void deleteTest()  {
	  OnboardeeDetails onboardee = getMockedObject();
	  Mockito.when(iOnboardingDao.deleteById(onboardee.getId())).thenReturn(1);
	  int output = iOnboardingService.deleteById(onboardee.getId());
	  assertEquals(1,output);
   }
   
   
   @Test
   public void updateTest()  {
	  OnboardeeDetails onboardee = getMockedObject();
	  Mockito.when(iOnboardingDao.update(Mockito.any())).thenReturn(1);
	  int output = iOnboardingService.update(onboardee);
	  assertEquals(1,output);
   }
   
   
   
   @Test
   public void getAllTest()  {
      List<OnboardeeDetails> onboardeeList = new ArrayList<OnboardeeDetails>();
      OnboardeeDetails onboardee = getMockedObject();
      onboardeeList.add(onboardee);
      Mockito.when(iOnboardingDao.getAll()).thenReturn(onboardeeList);
      List<OnboardeeDetails> outputordersList = iOnboardingService.getAll();
      assertNotNull(outputordersList);
   }
   
   
   
   private OnboardeeDetails getMockedObject() {
	   OnboardeeDetails onboardeeObj = new OnboardeeDetails("raj" , "aman123@gmail.com" , new Date(1998-02-26) , "15236547896" , "delhi",123 , "Bangalore" , "C++" , new Date(1998-02-26) , "pending" , "pending", new Date(1998-02-26) , "Ashok Kumar" , new Date(1998-02-26) , new Date(1998-02-26) , "Dev Intern" , "null" , "appearing");
	   return onboardeeObj;
   }
   
}