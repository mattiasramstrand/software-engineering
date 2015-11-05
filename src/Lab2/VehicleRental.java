package Lab2;

import java.util.List;
import java.util.ArrayList;

public class VehicleRental {
	
	
	private List<Customer> customer;
	private List<Reservation> reservation;
	private List<Category> category;
	private List<BranchOffice> branchoffice;
	
	
	public VehicleRental(){
		
		customer = new ArrayList<Customer>();
		reservation = new ArrayList<Reservation>();
		category = new ArrayList<Category>();
		branchoffice = new ArrayList<BranchOffice>();
	}


	
	//--------------------------- For customer-----------
	public void addCustmer(Customer c){
		customer.add(c);
	}
	
	public Customer findCustomer(String id_cu){			//ja neuveer li id_cu podxodit, tipo mozet bit id_c i t.t..???
		for (Customer cu : customer) {
		    if (id_cu.equals(cu.getID())) return cu;
		}
		return null;
	}
	
	public void removeCustomer(Customer cu){				
		customer.remove(cu);
	}//------------------------------------------------
	
	
	
	//--------------------------- For reservation-----------
	public void addReservation(Reservation r){
		reservation.add(r);
	}
	
	public Reservation findReservation(Reservation id_re){			
		for (Reservation re : reservation) {
		    if (id_re.equals(re.getID())) return re;
		}
		return null;
	}
	
	public void removeReservation(Reservation re){				
		reservation.remove(re);
	}//------------------------------------------------
	
	
	//--------------------------- For category-----------
	public void addCateory(Category ca){                  // esli ja napishu c ( kak v customer) budet osibka?
		category.add(ca);
	}
	
	public Category findCategory(String id_cat){			
		for (Category cat : category) {
		    if (id_cat.equals(cat.getID())) return cat;
		}
		return null;
	}
	
	public void removeCategory(Category cat){				// pocemu tu esce znacenie id? for id ze zakoncilsia po idee?
		category.remove(cat);
	}//------------------------------------------------
	
	
	//--------------------------- For BranchOffice -----------
	public void addBranchOffice(BranchOffice b){              // kakaja raznica elsi s bolsoi i malenkoi bukvi pisat?
		branchoffice.add(b);
	}
	
	public BranchOffice findBranchOffice(String id_br){			
		for (BranchOffice br : branchoffice) {
		    if (id_br.equals(br.getID())) return br;
		}
		return null;
	}
	
	public void removeBranchOffice(BranchOffice br){				
		branchoffice.remove(br);
	}//------------------------------------------------
}
	
		