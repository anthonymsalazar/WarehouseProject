package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Patagonia;

@Repository
public interface PatagoniaRepository extends CrudRepository<Patagonia, Integer> {

	@Query(value = "SELECT * FROM size LIKE %?1%", nativeQuery = true)
	public Iterable<Patagonia> findBySizeSearchString(String searchString);

	@Query(value = "SELECT * FROM color LIKE %?1%", nativeQuery = true)
	public Iterable<Patagonia> findByColorSearchString(String searchString);

}