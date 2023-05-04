package com.sppu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sppu.main.model.AddmisonForm;
import com.sppu.main.service.AddmisionFormService;

@RestController
public class SppuController2 {

	@Autowired
	AddmisionFormService afs;
	
	
	@GetMapping("/searchaddmision2/{i}")
	public ResponseEntity<AddmisonForm> searchData(@PathVariable int i) {
		
		return new ResponseEntity<>(afs.searchData(i),HttpStatus.OK);
	}
	
}
