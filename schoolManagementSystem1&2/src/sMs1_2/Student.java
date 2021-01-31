package sMs1_2;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private static int amountPaidAsFees;
	
	//93-1800
	public Student(int id,String name,int grade) {
		
		this.id=id;
		this.name=name;
		this.grade=grade;
		
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public static int getAmountPaidAsFees() {
		return amountPaidAsFees;
	}

	public void setAmountPaidAsFees(int amountPaidAsFees) {
		this.amountPaidAsFees = amountPaidAsFees;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public int gradePromotion(int grade) {
		this.grade=grade;
		grade=grade+1;
		return grade;
		
	}
	
	public int amount2bPaidAsFees(int grade) {
		int feesAmount=grade*100;
		return feesAmount;
		
		
		
	}
	
	public static Boolean feesPaid() {
		return true;
	}
	
	
	


}
