package Lab2;

import java.util.ArrayList;
import java.util.List;

public class BranchOffice {
	private String id;
	private String address;
	
	private List<Vehicle> vehicle;
	private List<Employee> employee;
	private List<Reservation> reservation1;
	private Reservation reservation2;
	
	public BranchOffice(String id, String address){
		this.id = id;
		this.address = address;
		vehicle = new ArrayList<Vehicle>();
		employee = new ArrayList<Employee>();
		reservation1 = new ArrayList<Reservation>();
		this.setReservation2(null);
		
		//this.pick_up2 = pick_up2;
		//this.setEmployee(employee);
		//damage = new ArrayList<Damage>();
		//this.setReturn(null);
		//this.setReservaton(reservation);
		//this.setVehicle(vehicle);
	}
	
	public String getID(){
		return id;
	}
	
	public void setID(){
		this.id = id;
	}
	
	//--------------------Employee-----------------
	public void addEmployee(Employee em){
		employee.add(em);
	}
	
	public Employee findEmployee(String id_empl){
		for (Employee empl : employee) {
		    if (id_empl.equals(empl.getId())) return empl;
		}
		return null;
	}
	
	public boolean removeEmployee(Employee empl){
		return employee.remove(empl);
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
	
	//---------------------Reservation-------------
	public void addReservation(Reservation re){
		reservation1.add(re);
	}
	
	public Reservation findReservation(Reservation id_re){
		for (Reservation re : reservation1) {
		    if (id_re.equals(re.getID())) return re;
		}
		return null;
	}
	
	public boolean removeReservation(Reservation re){
		return reservation1.remove(re);
	}
	
	public void setReservation2(Reservation reservation2) {
		this.reservation2 = reservation2;
	}

	public Reservation getReservation2() {
		return reservation2;
	}
}
