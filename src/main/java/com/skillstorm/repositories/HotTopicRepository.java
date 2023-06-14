package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.HotTopic;

@Repository
public interface HotTopicRepository extends CrudRepository<HotTopic, Integer> {

	@Query(value = "SELECT * FROM size LIKE %?1%", nativeQuery = true)
	public Iterable<HotTopic> findBySizeSearchString(String searchString);

	@Query(value = "SELECT * FROM color LIKE %?1%", nativeQuery = true)
	public Iterable<HotTopic> findByColorSearchString(String searchString);

}