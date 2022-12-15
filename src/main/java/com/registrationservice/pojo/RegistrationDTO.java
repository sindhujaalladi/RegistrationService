package com.registrationservice.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationDTO  implements Serializable{
	
	
	private int registrationid;
	private String registrationservicename;
	private String registrationownername;
	private double registrationfees;
	private String registrationLocation;

}
