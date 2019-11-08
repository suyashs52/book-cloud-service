package com.example.books.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.model.License;
import com.example.books.repository.LicenseRepository;

@Service
public class LicenseService {

	@Autowired
	private LicenseRepository licenseRepository;

	public License getLicense(String licenseId) {
		return new License(licenseId, UUID.randomUUID().toString(), "Product Name", "PreType");
	}

	public void updateLicense(License license) {

	}

	public void deleteLicense(License license) {

	}

	public void saveLicense(License license) {

		

		licenseRepository.save(license);

	}
}
