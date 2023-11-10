package com.cogent.example;
import java.io.Serializable;
import java.text.SimpleDateFormat; 
import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Objects; 
public class Contact implements Serializable {

	private String name; 
	private int contactNumber; 
	private String addressLine; 
	private LocalDate dateOfBirth; 

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, int contactNumber, String addressLine, 
			LocalDate dateOfBirth) {
		super(); 
		this.name = name; 
		this.contactNumber = contactNumber; 
		this.addressLine = addressLine; 
		this.dateOfBirth = dateOfBirth; 
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		
	//	SimpleDateFormat formatter=new SimpleDateFormat("dd MMMMM yy");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd L yy");
		
		
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + ", addressLine=" + addressLine
				+ ", dateOfBirth=" + dateOfBirth.format(formatter) + "]";
	}
	
	
	
}
