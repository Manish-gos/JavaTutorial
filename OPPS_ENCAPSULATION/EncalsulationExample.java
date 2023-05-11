package OPPS_ENCAPSULATION;
// wrape the data members and its methods in a single unit is called encapsulation 

public class EncalsulationExample {
	private String name;
	private Long phone;
	
	public String getName() {
		return name;
	}
	
	public Long getPhone() {
		return phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public EncalsulationExample(String name, Long phone) {
		this.name = name;
		this.phone = phone;
	}

	

}
