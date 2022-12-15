package com.registrationservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registrationservice.entity.Registration;


@Repository
public interface RegistrationRepository  extends JpaRepository<Registration,Integer> {
	
	Registration findByRegistrationid(int registrationid);
	
	List<Registration> findByRegistrationservicename(String registrationservicename);
}
