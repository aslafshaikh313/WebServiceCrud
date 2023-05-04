package com.sppu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sppu.main.globalExceptionHandler.DataNotFoundException;
import com.sppu.main.model.AddmisonForm;
import com.sppu.main.service.AddmisionFormService;

@RestController
public class SppuController {

	@Autowired
	AddmisionFormService afs;
	
	@GetMapping("/getaddmision")
	public Iterable<AddmisonForm> getData() {
		return afs.getData();
	}
	
	@PostMapping("/saveaddmision")
	public AddmisonForm saveData(@RequestBody AddmisonForm a) {
		return afs.save(a) ;
	}
	
	
	@PutMapping("/upadteaddmision/{i}")
	public ResponseEntity<AddmisonForm>  updateaddmision(@RequestBody AddmisonForm a, @PathVariable int i) {
		
		AddmisonForm addmisonForm = afs.updateData(a,i);
		return new ResponseEntity<AddmisonForm>(addmisonForm,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteaddmision/{i}")
	public ResponseEntity<String> deleteData(@PathVariable int i) {
		String data = afs.deleteData(i);
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	
	@GetMapping("/searchaddmision/{i}")
	public ResponseEntity<AddmisonForm> searchData(@PathVariable int i) {
		
		return new ResponseEntity<>(afs.searchData(i),HttpStatus.OK);
	}
	

}
