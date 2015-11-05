package Lab2;

import java.util.List;
import java.util.ArrayList;

public class Vehicle {
    private String id;                                 // ti zabil v pick up class dopiat id t.k k emu ze obrasciaetsia resiravation
	private String plate_number;
	private String kms;					//double
		
	
	private BranchOffice branchoffice;   // pocemu v pick up ti napisal Return return1? ja imeju pocemu tam 1 na konce?
	private Category category;
	
	
	public Vehicle(String id, String plate_number, String kms, Category category){
		this.id = id;
		this.plate_number = plate_number;
		this.kms = kms;
		
		//this.setCategory(category);
		this.setBranchOffice(null);
	}
	


	/*  public Category getCategpry()) {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	*/  
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getID() {
		return id;
	}
	
	
	public BranchOffice getBranchOffice() {
		return branchoffice;
	}
	
	public void setBranchOffice(BranchOffice branchoffice) {
		this.branchoffice = branchoffice;
	}
	
	
	public String getPlate_number() {
		return plate_number;
	}
	
	public String getKms() {
		return kms;
	}
	

	
	public void setPlate_number(String plate_number) {
		this.plate_number = plate_number;
	}
	
	public void setKms(String kms) {
		this.kms = kms;
	}
	
}