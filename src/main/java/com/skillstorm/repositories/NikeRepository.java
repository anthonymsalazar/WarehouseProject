package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Nike;

@Repository
public interface NikeRepository extends CrudRepository<Nike, Integer> {

	@Query(value = "SELECT * FROM size LIKE %?1%", nativeQuery = true)
	public Iterable<Nike> findBySizeSearchString(String searchString);

	@Query(value = "SELECT * FROM color LIKE %?1%", nativeQuery = true)
	public Iterable<Nike> findByColorSearchString(String searchString);

}