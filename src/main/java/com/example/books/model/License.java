package com.example.books.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "licenses")
public class License {
	@Id
	private String id;
	private String bookid;
	private String productName;
	private String licenseType;
	private int licenseMax;
	private int licenseAllocated;
	private String comment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String trim() {
		return bookid.trim();
	}

	public int getLicenseMax() {
		return licenseMax;
	}

	public void setLicenseMax(int licenseMax) {
		this.licenseMax = licenseMax;
	}

	public int getLicenseAllocated() {
		return licenseAllocated;
	}

	public void setLicenseAllocated(int licenseAllocated) {
		this.licenseAllocated = licenseAllocated;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public License(String id, String bookid, String productName, String licenseType) {
		// super();
		this.id = id;
		this.bookid = bookid;
		this.productName = productName;
		this.licenseType = licenseType;
	}

}
