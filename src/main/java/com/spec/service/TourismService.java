package com.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entity.TourismDetails;
import com.spec.repo.TourRepo;

@Service
public class TourismService {
	
	@Autowired
	TourRepo rp ;

	public List<TourismDetails> addNewTourDetails(List<TourismDetails> details) {
		// TODO Auto-generated method stub
		return rp.saveAll(details);
	}

	public List<TourismDetails> getDetails() {
		// TODO Auto-generated method stub
		return rp.findAll();
	}

}
