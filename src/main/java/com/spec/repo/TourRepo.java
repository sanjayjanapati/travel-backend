package com.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spec.entity.TourismDetails;

public interface TourRepo extends JpaRepository<TourismDetails, String>{

}
