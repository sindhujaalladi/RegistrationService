package com.registrationservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Registration")
public class Registration {
	
	
	@Id
	private int registrationid;
	
	@Column(name = "RegistrationServiceName")
	private String registrationservicename;
	
	@Column(name="RegistrationOwnerName")
	private String registrationownername;
	
	@Column(name = "RegistrationFees")
	private double registrationfees;
	
	@Column(name="RegistrationLocation")
	private String registrationLocation;


}
