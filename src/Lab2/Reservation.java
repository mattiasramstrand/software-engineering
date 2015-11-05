package Lab2;

//Reservation goes to:
	/*
	 Category;
	 Customer;
	 Pickup;
	 BranchOffice1;
	 BranchOffice2;
	 
	 */

public class Reservation {
	private String id;
	private String pickupDate;
	private String returnDate;
	private String rentalModality;

	private Category category; //Reservation has 1 category
	private pick_up pickup;  // Reservation has from 0 to 1 pick_ups
	private BranchOffice branchOffice; //Reservation has 1 pick_up// only one? Or 2 for 2 connections (thus make it like branchOffice1 and branchOffice2)
	private Customer customer; //Reservation has 1 customer.
	
	public Reservation(String id, String pickupDate, String returnDate, String rentalModality, Category category, Customer customer){
		this.id = id;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
		this.rentalModality = rentalModality;
		this.setCategory(category);
		this.setPickUp(pickup);
		this.setBranchOffice(branchOffice);
		this.setCustomer(customer);
	}
	
	
	public String getID(){
		return id;
	}
	
	//getters
	public String getPickupDate(){
		return pickupDate;
	}
	
	public String getReturnDate(){
		return returnDate;
	}
	
	public String getRentalModality(){
		return rentalModality;
	}
	
	
	public Category getCategor(){
		return category;
	}
	
	public pick_up getPickUp(){
		return pickup;
	}
	
	public BranchOffice getBranchOffice(){
		return branchOffice;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	//setters
	
	public void setID(String id){
		this.id = id;
	}
	
	public void setPickupDate(String pickupDate){
		this.pickupDate = pickupDate;
	}
	
	public void setReturnDate(String returnDate){
		this.returnDate = returnDate;
	}
	
	public void setRentalModality( String rentalModality){
		this.rentalModality = rentalModality;
	}
	
	public void setCategory(Category category){
		this.category = category;
	}
	public void setPickUp(pick_up pickup){
		this.pickup = pickup;
	}
	public void setBranchOffice(BranchOffice branchOffice){
		this.branchOffice = branchOffice;
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	
	//-----------------------------------
	
	
}
