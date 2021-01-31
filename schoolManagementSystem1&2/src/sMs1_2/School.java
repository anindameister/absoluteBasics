//package sMs1_2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class School {
//
//	public static void main(String[] args) {
//		
//
//		int totalFeesPaid=0;
//		totalFeesPaid=totalFeesPaid+FeesCalculation();
//		
//		
//		int totalSalaryPaid=0;
//		totalSalaryPaid=totalSalaryPaid+SalaryCalculation();
//		
//
//		Income(totalFeesPaid,totalSalaryPaid);
//		
//		System.out.println("the initial income at the begining of a month in form of fees paid by the students "+totalFeesPaid);
//		System.out.println("the initial expense at the end of a month in form of salary paid to the teachers "+totalSalaryPaid);
//		int balance=totalFeesPaid-totalSalaryPaid;
//		System.out.println("current balance "+balance);
//		
//
//}
//	
//	
//	
//	public static void Income(int totalFeesPaid,int totalSalaryPaid) {
//
//		int currentBalance=totalFeesPaid-totalSalaryPaid;
//		
//		System.out.println("current balance is " +currentBalance); 
//		
//	}
//	
//
//	
//	public static Integer FeesCalculation() {
//		
//		Student fernando= new Student(1,"Fernando Sucre",8);
//		Student gretchen= new Student(2,"Gretchen Morgan",9);
//		Student theodre= new Student(3,"Theodre Bagwell",8);
//		Student brad= new Student(4,"Brad Bellick",9);
//		Student paul= new Student(5,"Paul Kellerman",10);
//		Student james= new Student(6,"James Whistler",11);
//		Student donald= new Student(7,"Donald Self",10);
//		Student christina=new Student(8,"Rose Scofield",11);
//		
//		
//		
//		List<Student>Students=new ArrayList();
//		Students.add(fernando);
//		Students.add(gretchen);
//		Students.add(theodre);
//		Students.add(brad);
//		Students.add(paul);
//		Students.add(james);
//		Students.add(donald);
//		Students.add(christina);
//		
//		int arbitaryVariable=0;
//		for (Student s : Students) {
//		    arbitaryVariable=arbitaryVariable+s.amount2bPaidAsFees(s.getGrade());
//		}
//		return arbitaryVariable;
//		
//		
//		
//	}
//	
//	public static Integer SalaryCalculation() {
//		
//		Teacher michael=new Teacher(1,"Michael Scofield",4);
//		Teacher sara=new Teacher(1,"Sara Tancredi",3);
//		Teacher lincoln=new Teacher(1,"Lincoln Burrows",8);
//		
//		
//		List<Teacher>Teachers=new ArrayList();
//		Teachers.add(michael);
//		Teachers.add(sara);
//		Teachers.add(lincoln);
//		
//		int arbitaryVariablee=0;
//		for (Teacher t : Teachers) {
//		    arbitaryVariablee=arbitaryVariablee+t.amount2bReceivedAsSalary(t.getTotalYearOfOutsideExperience());
//		}
//		return arbitaryVariablee;
//		
//		
//		
//	}
//
//}
