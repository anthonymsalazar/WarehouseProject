package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.OldNavy;

@Repository
public interface OldNavyRepository extends CrudRepository<OldNavy, Integer> {

	@Query(value = "SELECT * FROM size LIKE %?1%", nativeQuery = true)
	public Iterable<OldNavy> findBySizeSearchString(String searchString);

	@Query(value = "SELECT * FROM color LIKE %?1%", nativeQuery = true)
	public Iterable<OldNavy> findByColorSearchString(String searchString);

}