package com.registrationservice.service;

import java.util.List;

import com.registrationservice.entity.Registration;
import com.registrationservice.pojo.RegistrationDTO;

public interface RegistrationService {
	
	
	String createRegistrationdata(RegistrationDTO registrationdto);
	
	List<Registration> getAllRegistrationData();
	
	RegistrationDTO getRegistrationData(int registrationid);
	
	List<Registration> getVehicleRegistration(String registrationservicename);
	

}
