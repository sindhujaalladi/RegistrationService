package com.registrationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationservice.entity.Registration;
import com.registrationservice.pojo.RegistrationDTO;
import com.registrationservice.repository.RegistrationRepository;


@Service
public class RegistrationServiceImp implements RegistrationService{
	
	
	@Autowired
	private RegistrationRepository registrationrepository;

	@Override
	public String createRegistrationdata(RegistrationDTO registrationdto) {
		
		Registration regobj = Registration.builder()
				.registrationid(registrationdto.getRegistrationid())
				.registrationLocation(registrationdto.getRegistrationLocation())
				.registrationownername(registrationdto.getRegistrationownername())
				.registrationservicename(registrationdto.getRegistrationservicename())
				.registrationfees(registrationdto.getRegistrationfees())
				.build();
		registrationrepository.save(regobj);
		return "registration data create and stored in db";
	}

	@Override
	public List<Registration> getAllRegistrationData() {
		List<Registration> registrationlistobj = registrationrepository.findAll();
		return registrationlistobj;
	}

	@Override
	public RegistrationDTO getRegistrationData(int registrationid) {
		Registration regenobj = registrationrepository.findByRegistrationid(registrationid);
		RegistrationDTO dtoobj = RegistrationDTO.builder()
				.registrationid(regenobj.getRegistrationid())
				.registrationLocation(regenobj.getRegistrationLocation())
				.registrationownername(regenobj.getRegistrationownername())
				.registrationservicename(regenobj.getRegistrationservicename())
				.registrationfees(regenobj.getRegistrationfees())
				.build();
		return dtoobj;
	}

	@Override
	public List<Registration> getVehicleRegistration(String registrationservicename) {
		List<Registration> listobj = registrationrepository.findByRegistrationservicename(registrationservicename);
		return listobj;
	}

}
