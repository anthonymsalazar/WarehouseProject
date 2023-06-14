package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Nike;
import com.skillstorm.repositories.NikeRepository;

@Service
public class NikeServices {

	@Autowired
	private NikeRepository repo;

	public Nike nikeCheck(Nike item) {
		return repo.save(item);
	}

}