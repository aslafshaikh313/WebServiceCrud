package com.cjcmain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjcmain.model.Person;
import com.cjcmain.panCardServiceInter.PanCardServiceInter;
import com.cjcmain.personServiceInter.PersonServiceInter;

@RestController
public class HomeController {

	
	@Autowired
	PersonServiceInter psi;
	
	@Autowired
	PanCardServiceInter pci;
	
	
	@RequestMapping("/")
	public String preLogin() {
		
//		psi.saveData(p);
		return"Data Added";
				
	}
	
	@PostMapping("/save")
	public String saveDta(@RequestBody Person p) {
		
		psi.saveData(p);
		return"Data Added";
				
	}
	
	@GetMapping("/getAllData")
	public Iterable getData() {
		
	Iterable list=	psi.getAllData();
		return list;
				
	}
	
	
	@GetMapping("/getSingleData/{personId}")
	public Person getSingleData(@PathVariable("personId") int id) {
		
	Person pp=	psi.getSingleData(id);
		return pp;
				
	}
	
	
	@PutMapping("/updateperson/{personId}/{panCardNumber}")
	public String updatePersonData(@PathVariable("personId") int id,@PathVariable("panCardNumber") int pid,@RequestBody Person p) {
		
		psi.saveData(p);
		return"Person Data Updated";
				
	}
	
	
	@DeleteMapping("/deleteData/{personId}")
	public String updatePersonData(@PathVariable("personId") int id) {
		
		psi.deleteData(id);
		return"Person Data Deleted";
				
	}
}
