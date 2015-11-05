package Lab2;

public class Employee {
	private String id;
	private String name;
	private String administrator;
	
	
	public Employee (String id, String name, String administrator){
		this.id = id;
		this.name = name;
		this.administrator = administrator;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdministrator() {
		return administrator;
	}
	
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	
}

