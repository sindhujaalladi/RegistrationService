package com.registrationservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registrationservice.entity.Registration;
import com.registrationservice.pojo.RegistrationDTO;
import com.registrationservice.service.RegistrationService;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationservice;
	
	Logger logger=LoggerFactory.getLogger(RegistrationController.class);

	
	@PostMapping("/createregistrationdata")
	public String createRegistrationdata(@RequestBody RegistrationDTO registrationdto) {
		String response = this.registrationservice.createRegistrationdata(registrationdto);
		return response;
	}
	
	@GetMapping("/getAllregistrationdata")
	public List<Registration> getAllRegistrationData(){
		logger.info("Beginning of getAllRegistrationData method");
		List<Registration> listobj = this.registrationservice.getAllRegistrationData();
		logger.info("End of  getAllRegistrationData method");
		return listobj;
	}
	
	@GetMapping("/{registrationid}")
	public ResponseEntity<RegistrationDTO> getRegistrationData(@PathVariable int registrationid){
		RegistrationDTO dtoobj = this.registrationservice.getRegistrationData(registrationid);
		return new ResponseEntity<>(dtoobj , HttpStatus.OK);
	}
	
	
	@GetMapping("/servicetype/{registrationservicename}")
	public List<Registration> getVehicleRegistration(@PathVariable String registrationservicename){
		logger.info("Beginning of getVehicleRegistration method");
		List<Registration> listobj = this.registrationservice.getVehicleRegistration(registrationservicename);
		logger.info("Beginning of getVehicleRegistration method");
		return listobj;
	}

}
