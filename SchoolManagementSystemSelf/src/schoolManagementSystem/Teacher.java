package schoolManagementSystem;

public class Teacher {
	
	private int id;
	private String name;
	private int totalYearOfOutsideExperience;
	
	public Teacher(int id,String name,int totalYearOfOutsideExperience) {
		
		this.id=id;
		this.name=name;
		this.totalYearOfOutsideExperience=totalYearOfOutsideExperience;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public int getTotalYearOfOutsideExperience() {
		return totalYearOfOutsideExperience;
	}

	public void setTotalYearOfOutsideExperience(int totalYearOfOutsideExperience) {
		this.totalYearOfOutsideExperience = totalYearOfOutsideExperience;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", totalYearOfOutsideExperience=" + totalYearOfOutsideExperience
				+ "]";
	}

	public int amount2bReceivedAsSalary(int totalYearOfOutsideExperience) {
		int salaryAmount=totalYearOfOutsideExperience*290;
		return salaryAmount;
		
		
		
	}
	
//	static int salaryPaid=0;
	
	

}
