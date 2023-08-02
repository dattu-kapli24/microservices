package com.motoassembly.solution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motoassembly.solution.models.MotoAssembly;
import com.motoassembly.solution.service.MaterialProcurementService;

@RestController
public class MotoAssemblyRestController {
	
	@Autowired
	private MaterialProcurementService materialProcurementService;
	
	@Autowired
	private MotoAssembly motoAssembly;
	
	
	@GetMapping("/procureMaterials")
	public String startProcument() {
		return materialProcurementService.procureMaterial();
	}
	

	@GetMapping("/beginMachineFormings")
	public String startMachineForming() {
		return "Machine forming started";
	}
	
	@PostMapping("/postQaData")
	public String postMotoAssemblyData(MotoAssembly motoAssembly) {
		return "QA analsysis done";
	}

}
