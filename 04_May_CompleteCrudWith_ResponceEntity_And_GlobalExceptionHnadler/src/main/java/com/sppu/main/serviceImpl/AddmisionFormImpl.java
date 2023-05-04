package com.sppu.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sppu.main.globalExceptionHandler.DataNotFoundException;
import com.sppu.main.model.AddmisonForm;
import com.sppu.main.repository.AddmisonFormRepo;
import com.sppu.main.service.AddmisionFormService;

@Service
public class AddmisionFormImpl implements AddmisionFormService {

	@Autowired
	AddmisonFormRepo afr;

	@Override
	public AddmisonForm save(AddmisonForm a) {

		return afr.save(a);
	}

	@Override
	public Iterable<AddmisonForm> getData() {
		// TODO Auto-generated method stub
		
		
		
		return afr.findAll();
	}

	@Override
	public AddmisonForm updateData(AddmisonForm a, int i) {

		Optional<AddmisonForm> optional = afr.findById(i);

		if (optional.isPresent()) {
			a.setId(i);
			return afr.save(a);
		} else {

			throw new DataNotFoundException("Data Not Present Of This Id To Update or Invalid Id");
		}
	}

	@Override
	public String deleteData(int i) {
		// TODO Auto-generated method stub

		Optional<AddmisonForm> optional = afr.findById(i);

		if (optional.isPresent()) {

			afr.deleteById(i);
			return "Delete Succesfully";
		} else {

			throw new DataNotFoundException("Data Not Present Of This Id To Delete or Invalid Id");
		}

	}

	@Override
	public AddmisonForm searchData(int i) {
		
		
		Optional<AddmisonForm> data = afr.findById(i);
		
		if (data.isPresent()) {
			return data.get();
		}
		else {
			
			throw new DataNotFoundException("Data Not Present Of This Id or Invalid Id");
		}
//		return afr.findById(i).get();
	}

}
