package reflection;

public class Stinfo {
	
	public String name = "Mamun";
	
	private String ssn;
	
	public Stinfo() {
		ssn= "12345678";
	}
	
	public void getSSn() {
		System.out.println("SSN is "+ssn);
	}
	
	public void dsiplayName() {
		System.out.println("Name is "+name);
	}
	
	private void displaySalary() {
		System.out.println("Salary is "+120000);
	}
	
	
	
	

}
