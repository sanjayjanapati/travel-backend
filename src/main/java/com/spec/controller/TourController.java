package com.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spec.entity.TourismDetails;
import com.spec.service.TourismService;

@CrossOrigin("*")
@RestController
public class TourController 
{
	@Autowired
	TourismService tourSer;
	
	@PostMapping("/tourism/add")
	public List<TourismDetails> addTourDetails(@RequestBody List<TourismDetails> details)
	{
		return tourSer.addNewTourDetails(details);
	}
	@GetMapping("/tourism/get")
	public List<TourismDetails> getAllDestails()
	{
		return tourSer.getDetails();
	}
}
