package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.OldNavy;
import com.skillstorm.repositories.OldNavyRepository;

@Service
public class OldNavyServices {

	@Autowired
	private OldNavyRepository repo;

	public OldNavy oldNavyCheck(OldNavy item) {
		return repo.save(item);
	}

}