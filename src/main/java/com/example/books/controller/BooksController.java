package com.example.books.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.config.ServiceConfig;
import com.example.books.model.License;
import com.example.books.services.LicenseService;

@RestController
@RequestMapping(value = "v1/books/{bookid}/licenses")
public class BooksController {
	@Autowired
	LicenseService licenseService;
	@Autowired
	ServiceConfig serviceConfig;

	@GetMapping("/{licenseid}")
	public License getLicense(@PathVariable("bookid") String bookid, @PathVariable("licenseid") String licenseid) {
		License li = licenseService.getLicense(bookid);
		li.setComment(serviceConfig.getExampleProperty());
		return li;
	}

	@PutMapping("/{licenseid}")
	public String updateLicense(@PathVariable("licenseid") String licenseid) {
		return String.format("this is update %s", licenseid);
	}

	@PostMapping(value = "/")
	public void saveLicenses(@RequestBody License license) {
		license.setId(UUID.randomUUID().toString());

		licenseService.saveLicense(license);

	}

	@DeleteMapping(value = "{licenseId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteLicenses(@PathVariable("licenseId") String licenseId) {

		return String.format("This is the Delete");

	}

}
