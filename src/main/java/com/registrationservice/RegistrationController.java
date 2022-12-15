package com.registrationservice;

import java.util.List;

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
	
	
	@PostMapping("/createregistrationdata")
	public String createRegistrationdata(@RequestBody RegistrationDTO registrationdto) {
		String response = this.registrationservice.createRegistrationdata(registrationdto);
		return response;
	}
	
	@GetMapping("/getAllregistrationdata")
	public List<Registration> getAllRegistrationData(){
		List<Registration> listobj = this.registrationservice.getAllRegistrationData();
		return listobj;
	}
	
	@GetMapping("/{registrationid}")
	public ResponseEntity<RegistrationDTO> getRegistrationData(@PathVariable int registrationid){
		RegistrationDTO dtoobj = this.registrationservice.getRegistrationData(registrationid);
		return new ResponseEntity<>(dtoobj , HttpStatus.OK);
	}
	
	
	@GetMapping("/servicetype/{registrationservicename}")
	public List<Registration> getVehicleRegistration(@PathVariable String registrationservicename){
		List<Registration> listobj = this.registrationservice.getVehicleRegistration(registrationservicename);
		return listobj;
	}

}
