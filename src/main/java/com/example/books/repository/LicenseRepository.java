package com.example.books.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.books.model.License;

public interface LicenseRepository extends CrudRepository<License, String> {

	public List<License> findByBookid(String bookId);

	 

}
