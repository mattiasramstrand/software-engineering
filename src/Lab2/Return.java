package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Return {
	private String date;
	private String costcharged;
	private String ischarged;
	private String kms;
	private String gas_level;
	
	private pick_up pick_up2;
	private Employee employee;
	private List<Damage> damage;
	
	public Return(String date, String costcharged, String ischarged, String kms, String gas_level, pick_up pick_up2, Employee employee){
		this.date = date;
		this.costcharged = costcharged;
		this.ischarged = ischarged;
		this.kms = kms;
		this.gas_level = gas_level;
		
		this.pick_up2 = pick_up2;
		this.setEmployee(employee);
		damage = new ArrayList<Damage>();
		//this.setReturn(null);
		//this.setReservaton(reservation);
		//this.setVehicle(vehicle);
	}
	
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getCostcharged() {
		return costcharged;
	}
	
	public void setCostcharged(String costcharged) {
		this.costcharged = costcharged;
	}
	
	public String getKms() {
		return kms;
	}
	
	public void setKms(String kms) {
		this.kms = kms;
	}
	
	public String getGasLevel() {
		return gas_level;
	}
	
	public void setGasLevel(String gas_level) {
		this.gas_level = gas_level;
	}
	
	public pick_up getPickUp() {
		return pick_up2;
	}
	
	public void setPickUp(pick_up pick_up2) {
		this.pick_up2 = pick_up2;
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
		
}
