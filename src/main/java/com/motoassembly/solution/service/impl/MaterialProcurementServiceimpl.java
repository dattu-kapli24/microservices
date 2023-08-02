package com.motoassembly.solution.service.impl;

import org.springframework.stereotype.Service;

import com.motoassembly.solution.service.MaterialProcurementService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MaterialProcurementServiceimpl implements MaterialProcurementService {
    
	 @HystrixCommand(fallbackMethod = "fallbackMethod")
	public String procureMaterial() {
		return "Procured succesfully";
	}
	 
	 public String fallbackMethod() {
	        return "procurement failed";
	    }
}
