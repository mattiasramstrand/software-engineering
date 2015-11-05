package Lab2;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String id;                                 
	private String name;
	private String address;
	private String city;
	private String postalCode;
	private String dateDriverlicense;
	private String digitsCC;
	private String mounthCC;
	private String yearCC;
	private String cvcCC;
	private String typeCC;
				
	
	public Customer(String id, String name, String address, String city, String postalCode, String dateDriverlicense, String digitsCC, String mounthCC, 
	                        String yearCC, String cvcCC, String typeCC){
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.dateDriverlicense = dateDriverlicense;
		this.digitsCC = digitsCC;
		this.mounthCC = mounthCC;
		this.yearCC = yearCC;
		this.cvcCC = cvcCC;
		this.typeCC = typeCC;		
	}

	public void setID(String id) {
		this.id = id;
	}
	
	public String getID() {  // pocemu ID Name i.t.t s bolsoi bukvi ? ili netu raznici?
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getDateDriverlicense() {
		return dateDriverlicense;
	}
	public String getDigitsCC() {
		return digitsCC;
	}
	
	public String getMounthCC() {
		return mounthCC;
	}
	public String getYearCC() {
		return yearCC;
	}
	public String getCvcCC() {
		return cvcCC;
	}
	public String getTypeCC() {
		return typeCC;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setDateDriverlicense(String dateDriverlicense) {
		this.dateDriverlicense = dateDriverlicense;
	}
	
	public void setDigitsCC(String digitsCC) {
		this.digitsCC = digitsCC;
	}
	
	public void setMounthCC(String mounthCC) {
		this.mounthCC = mounthCC;
	}
	
	public void setYearCC(String yearCC) {
		this.yearCC = yearCC;
	}
	
	public void setCvcCC(String cvcCC) {
		this.cvcCC = cvcCC;
	}

	public void setTypeCC(String typeCC) {
		this.typeCC = typeCC;
	}
}