package com.cjcmain.personServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjcmain.model.Person;
import com.cjcmain.personRepositoryInter.PersonRepositoryInter;
import com.cjcmain.personServiceInter.PersonServiceInter;

@Service
public class PersonServiceImpl implements PersonServiceInter {

	@Autowired
	PersonRepositoryInter pri;

	@Override
	public void saveData(Person p) {

		pri.save(p);
	}

	@Override
	public Iterable getAllData() {
		return pri.findAll();

	}

	@Override
	public void deleteData(int id) {
		pri.deleteById(id);
		
	}

	@Override
	public Person getSingleData(int id) {
		
	Person p=pri.findByPersonId(id);
		
		return p;
	}


}
