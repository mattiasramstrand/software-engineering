package Lab2;

import java.util.ArrayList;
import java.util.List;

/*Category goes to:
		Category;
		Vehicle list;
	*/

//add id
public class Category {
	
	private String id;
	private double priceunlimitedMileage;
	private double priceFixedMileage;
	private double priceAdditionalKm;
	private double priceFullInsurance;
	private double pricePartialInsurance;

	private List<Vehicle> vehicle;
	private Category upper;
	
	public Category(String id, double priceunlimitedMilage, double priceFixedMileage, double priceAdditionalKm, double priceFullInsurance, double pricePartialInsurance){
		this.id = id;
		this.priceunlimitedMileage = priceunlimitedMileage;
		this.priceFixedMileage = priceFixedMileage;
		this.priceAdditionalKm = priceAdditionalKm;
		this.priceFullInsurance = priceFullInsurance;
		this.pricePartialInsurance = pricePartialInsurance;
		
		vehicle = new ArrayList<Vehicle>();
		//this.setCategory(upper);
	}
	
	public String getID(){
		return id;
	}
	
	public void setID(){
		this.id = id;
	}
	
	public Category getCategory(){
		return upper;
	}
	
	public void setCategory(Category upper){
		this.upper = upper;
	}
	
	//---------------------Vehicle-------------------
		public void addVehicle(Vehicle vh){
			vehicle.add(vh);
		}
		
		public Vehicle findVehicle(String id_vehicle1){
			for (Vehicle vehicle1 : vehicle) {
			    if (id_vehicle1.equals(vehicle1.getID())) return vehicle1;
			}
			return null;
		}
		
		public boolean removeVehicle(Vehicle vehicle1){
			return vehicle.remove(vehicle1);
		}
	
}
