package com.skillstorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.HotTopic;
import com.skillstorm.repositories.HotTopicRepository;

@Service
public class HotTopicServices {

	@Autowired
	private HotTopicRepository repo;

	public HotTopic hotTopicCheck(HotTopic item) {
		return repo.save(item);
	}

}