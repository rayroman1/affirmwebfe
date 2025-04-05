package com.example_affirmunregister.demo_affirm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example_affirmunregister.demo_affirm.model.Cust;
import com.example_affirmunregister.demo_affirm.service.ServiceMethods;

@CrossOrigin(origins = "*")
@RestController
public class MainController {
	@Autowired
	ServiceMethods  serviceCL;
	
	@RequestMapping("/")
	public String newpage() {
		
		return "Method";
	}

	@GetMapping("/custs")
	public Iterable<Cust> getcusts(){
		
		return serviceCL.getAllCusts();
	}
	
	
}
//test jenkins 13
