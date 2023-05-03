package com.cjcmain.personRepositoryInter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjcmain.model.Person;

@Repository
public interface PersonRepositoryInter extends CrudRepository<Person, Integer>{

	Person findByPersonId(int id);

}
