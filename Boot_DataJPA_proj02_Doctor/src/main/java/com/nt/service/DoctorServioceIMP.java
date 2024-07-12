package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IDoctorRepo;
import com.nt.sbeans.Doctor;

@Service("doctorService")
public class DoctorServioceIMP  implements IDoctorService{

	@Autowired
	private IDoctorRepo repo;
	
	
	@Override
	public String registerDoctor(Doctor doc) {
		
		Doctor d = repo.save(doc);
		return "Doctor obj insert sucess  :"+d.getId();
	}

}
