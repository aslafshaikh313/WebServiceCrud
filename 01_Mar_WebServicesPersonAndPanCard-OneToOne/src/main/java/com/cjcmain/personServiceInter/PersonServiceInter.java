package com.cjcmain.personServiceInter;

import com.cjcmain.model.Person;

public interface PersonServiceInter {

	void saveData(Person p);

	Iterable getAllData();

	void deleteData(int id);

	Person getSingleData(int id);

}
