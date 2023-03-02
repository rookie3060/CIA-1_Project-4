package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Family;

@RestController
public class ApiControllers {
	public List<Family> createFamily(){
		List<Family> l=new ArrayList<>();
		l.add(new Family("Rolex",18,"Brother"));
		l.add(new Family("MR.D",15,"Sister"));
		l.add(new Family("Devi",36,"Mother"));
		l.add(new Family("Sai",13,"Brother"));
		l.add(new Family("Daddy",40,"Father"));
		return l;
	}
	
@GetMapping("/")
public List<Family> getFamiltDetails(){
	return createFamily();
}
}
