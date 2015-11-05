package Lab2;

import java.util.List;
import java.util.ArrayList;

public class pick_up {
	private String date;
	private String insuranceModality;
	private String kms;					//double
	private String gas_level;			//double ...
	
	private Return return1;
	private Vehicle vehicle;
	private Employee employee;
	private Reservation reservation;
	private List<Damage> damage;
	
	public pick_up(String date, String insurance_modality, String kms, String gas_level, Reservation reservation, Vehicle vehcile, Employee employee){
		this.date = date;
		this.insuranceModality = insuranceModality;
		this.kms = kms;
		this.gas_level = gas_level;
		this.setReturn(null);
		this.setReservaton(reservation);
		this.setVehicle(vehicle);
		this.setEmployee(employee);
		damage = new ArrayList<Damage>();
	}
	

	
	/*private Department department_belongs;
	private Department department_managed;
	private List<Suggestion> suggestions_made;
	private Suggestion suggestion_coordinated;
	private List<Evaluation> evaluations;

	public Employee(String dni, String name, Department dep_belongs, Evaluation eval){
		this.setDni(dni);
		this.setName(name);
		this.setDepartment_belongs(dep_belongs);
		this.setDepartment_managed(null);
		this.suggestions_made=new ArrayList<Suggestion>();
		this.setSuggestion_coordinated(null);
		this.evaluations=new ArrayList<Evaluation>();
		this.evaluations.add(eval);
	}*/

	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Return getReturn() {
		return return1;
	}
	
	public void setReturn(Return return1) {
		this.return1 = return1;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	//--------------------------- For damage-----------
	public void addDamage(Damage d){
		damage.add(d);
	}
	
	public Damage find_Damage(String id_dm){			//do i need it? yes
		for (Damage dm : damage) {
		    if (id_dm.equals(dm.getId())) return dm;
		}
		return null;
	}
	
	public void remove_Damage(Damage dm){				//do i need it? yes
		damage.remove(dm);
	}//------------------------------------------------
	
	public String getDate() {
		return date;
	}
	
	public String getInsuranceModality() {
		return insuranceModality;
	}
	
	public String getKms() {
		return kms;
	}
	
	public String getGas_level() {
		return gas_level;
	}
	
	public Reservation getReservation()	{
		return reservation;
	}
	
	public void setReservaton(Reservation reservation)	{
		this.reservation = reservation;
	}
	
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setInsuranceModality(String insuranceModality) {
		this.insuranceModality = insuranceModality;
	}
	
	public void setKms(String kms) {
		this.kms = kms;
	}
	
	public void setGas_level(String gas_level) {
		this.gas_level = gas_level;
	}
}
