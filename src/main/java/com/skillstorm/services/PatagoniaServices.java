package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Patagonia;
import com.skillstorm.repositories.PatagoniaRepository;

@Service
public class PatagoniaServices {

	@Autowired
	private PatagoniaRepository repo;

	public Patagonia patagoniaCheck(Patagonia item) {
		return repo.save(item);
	}

}